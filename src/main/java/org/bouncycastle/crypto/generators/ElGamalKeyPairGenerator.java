package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;

public class ElGamalKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private ElGamalKeyGenerationParameters param;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.bouncycastle.crypto.AsymmetricCipherKeyPair.<init>(org.bouncycastle.crypto.params.AsymmetricKeyParameter, org.bouncycastle.crypto.params.AsymmetricKeyParameter):void
     arg types: [org.bouncycastle.crypto.params.ElGamalPublicKeyParameters, org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters]
     candidates:
      org.bouncycastle.crypto.AsymmetricCipherKeyPair.<init>(org.bouncycastle.crypto.CipherParameters, org.bouncycastle.crypto.CipherParameters):void
      org.bouncycastle.crypto.AsymmetricCipherKeyPair.<init>(org.bouncycastle.crypto.params.AsymmetricKeyParameter, org.bouncycastle.crypto.params.AsymmetricKeyParameter):void */
    public AsymmetricCipherKeyPair generateKeyPair() {
        DHKeyGeneratorHelper dHKeyGeneratorHelper = DHKeyGeneratorHelper.INSTANCE;
        ElGamalParameters parameters = this.param.getParameters();
        DHParameters dHParameters = new DHParameters(parameters.getP(), parameters.getG(), null, parameters.getL());
        BigInteger calculatePrivate = dHKeyGeneratorHelper.calculatePrivate(dHParameters, this.param.getRandom());
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new ElGamalPublicKeyParameters(dHKeyGeneratorHelper.calculatePublic(dHParameters, calculatePrivate), parameters), (AsymmetricKeyParameter) new ElGamalPrivateKeyParameters(calculatePrivate, parameters));
    }

    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (ElGamalKeyGenerationParameters) keyGenerationParameters;
    }
}
