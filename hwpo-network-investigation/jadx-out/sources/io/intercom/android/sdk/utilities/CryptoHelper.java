package io.intercom.android.sdk.utilities;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.intercom.twig.BuildConfig;
import com.intercom.twig.Twig;
import defpackage.gz3;
import defpackage.ua1;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CryptoHelper {
    public static final int $stable;
    private static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    private static final int GCM_IV_LENGTH = 12;
    private static final int GCM_TAG_LENGTH = 128;
    public static final CryptoHelper INSTANCE = new CryptoHelper();
    private static final String KEY_ALIAS = "intercom_sdk_prefs_key";
    private static final String TRANSFORMATION = "AES/GCM/NoPadding";
    private static KeyProvider keyProvider;
    private static final Twig twig;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AndroidKeystoreKeyProvider implements KeyProvider {
        public static final AndroidKeystoreKeyProvider INSTANCE = new AndroidKeystoreKeyProvider();

        private AndroidKeystoreKeyProvider() {
        }

        private final SecretKey generateKey() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", CryptoHelper.ANDROID_KEYSTORE);
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(CryptoHelper.KEY_ALIAS, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
            keyGenParameterSpecBuild.getClass();
            keyGenerator.init(keyGenParameterSpecBuild);
            SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
            secretKeyGenerateKey.getClass();
            return secretKeyGenerateKey;
        }

        @Override // io.intercom.android.sdk.utilities.CryptoHelper.KeyProvider
        public void deleteKey() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            KeyStore keyStore = KeyStore.getInstance(CryptoHelper.ANDROID_KEYSTORE);
            keyStore.load(null);
            keyStore.deleteEntry(CryptoHelper.KEY_ALIAS);
        }

        @Override // io.intercom.android.sdk.utilities.CryptoHelper.KeyProvider
        public SecretKey getOrCreateKey() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, UnrecoverableEntryException {
            KeyStore keyStore = KeyStore.getInstance(CryptoHelper.ANDROID_KEYSTORE);
            keyStore.load(null);
            KeyStore.Entry entry = keyStore.getEntry(CryptoHelper.KEY_ALIAS, null);
            KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
            if (secretKeyEntry == null) {
                return generateKey();
            }
            SecretKey secretKey = secretKeyEntry.getSecretKey();
            secretKey.getClass();
            return secretKey;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface KeyProvider {
        void deleteKey();

        SecretKey getOrCreateKey();
    }

    static {
        Twig logger = LumberMill.getLogger();
        logger.getClass();
        twig = logger;
        keyProvider = AndroidKeystoreKeyProvider.INSTANCE;
        $stable = 8;
    }

    private CryptoHelper() {
    }

    private final void handleKeyStoreError(Exception exc) {
        twig.w(exc, "Keystore error, regenerating key. Data encrypted with old key will be lost.", new Object[0]);
        try {
            keyProvider.deleteKey();
            keyProvider.getOrCreateKey();
        } catch (Exception e) {
            twig.w(e, "failed to regenerate key", new Object[0]);
        }
    }

    public final String decrypt$intercom_sdk_base_release(String str) {
        str.getClass();
        if (str.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        try {
            SecretKey orCreateKey = keyProvider.getOrCreateKey();
            byte[] bArrDecode = Base64.decode(str, 2);
            if (bArrDecode.length <= 12) {
                return BuildConfig.FLAVOR;
            }
            byte[] bArrJ = gz3.j(bArrDecode, 0, 12);
            byte[] bArrJ2 = gz3.j(bArrDecode, 12, bArrDecode.length);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(2, orCreateKey, new GCMParameterSpec(GCM_TAG_LENGTH, bArrJ));
            byte[] bArrDoFinal = cipher.doFinal(bArrJ2);
            bArrDoFinal.getClass();
            return new String(bArrDoFinal, ua1.b);
        } catch (KeyStoreException e) {
            handleKeyStoreError(e);
            return BuildConfig.FLAVOR;
        } catch (UnrecoverableKeyException e2) {
            handleKeyStoreError(e2);
            return BuildConfig.FLAVOR;
        } catch (Exception e3) {
            twig.w(e3, "decryption failed", new Object[0]);
            return BuildConfig.FLAVOR;
        }
    }

    public final String encrypt$intercom_sdk_base_release(String str) {
        str.getClass();
        if (str.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        try {
            SecretKey orCreateKey = keyProvider.getOrCreateKey();
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(1, orCreateKey);
            byte[] iv = cipher.getIV();
            byte[] bytes = str.getBytes(ua1.b);
            bytes.getClass();
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            iv.getClass();
            bArrDoFinal.getClass();
            int length = iv.length;
            int length2 = bArrDoFinal.length;
            byte[] bArrCopyOf = Arrays.copyOf(iv, length + length2);
            System.arraycopy(bArrDoFinal, 0, bArrCopyOf, length, length2);
            return Base64.encodeToString(bArrCopyOf, 2);
        } catch (KeyStoreException e) {
            handleKeyStoreError(e);
            return BuildConfig.FLAVOR;
        } catch (UnrecoverableKeyException e2) {
            handleKeyStoreError(e2);
            return BuildConfig.FLAVOR;
        } catch (Exception e3) {
            twig.w(e3, "encryption failed", new Object[0]);
            return BuildConfig.FLAVOR;
        }
    }

    public final KeyProvider getKeyProvider$intercom_sdk_base_release() {
        return keyProvider;
    }

    public final void setKeyProvider$intercom_sdk_base_release(KeyProvider keyProvider2) {
        keyProvider2.getClass();
        keyProvider = keyProvider2;
    }

    public static /* synthetic */ void getKeyProvider$intercom_sdk_base_release$annotations() {
    }
}
