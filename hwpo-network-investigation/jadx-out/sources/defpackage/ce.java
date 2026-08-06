package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ce implements if2 {
    public final if2 a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public ce(if2 if2Var, byte[] bArr, byte[] bArr2) {
        this.a = if2Var;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.if2
    public final long c(of2 of2Var) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                mf2 mf2Var = new mf2(this.a, of2Var);
                this.d = new CipherInputStream(mf2Var, cipher);
                mf2Var.h();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                d55.a(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            d55.a(e2);
            return 0L;
        }
    }

    @Override // defpackage.if2
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // defpackage.if2
    public final void d(yua yuaVar) {
        yuaVar.getClass();
        this.a.d(yuaVar);
    }

    @Override // defpackage.if2
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.if2
    public final Map<String, List<String>> k() {
        return this.a.k();
    }

    @Override // defpackage.ef2
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.d.getClass();
        int i3 = this.d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }
}
