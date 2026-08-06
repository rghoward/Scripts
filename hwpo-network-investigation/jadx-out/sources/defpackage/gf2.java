package defpackage;

import android.net.Uri;
import android.util.Base64;
import j$.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gf2 extends ck0 {
    public of2 e;
    public byte[] f;
    public int g;
    public int h;

    @Override // defpackage.if2
    public final long c(of2 of2Var) throws lf2, ut7 {
        q(of2Var);
        this.e = of2Var;
        Uri uri = of2Var.a;
        long j = of2Var.f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        xl7.i("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = n6b.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ut7("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new ut7(ct1.a("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            this.f = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = of2Var.e;
        byte[] bArr = this.f;
        if (j2 > bArr.length) {
            this.f = null;
            throw new lf2(2008);
        }
        int i = (int) j2;
        this.g = i;
        int length = bArr.length - i;
        this.h = length;
        if (j != -1) {
            this.h = (int) Math.min(length, j);
        }
        r(of2Var);
        return j != -1 ? j : this.h;
    }

    @Override // defpackage.if2
    public final void close() {
        if (this.f != null) {
            this.f = null;
            p();
        }
        this.e = null;
    }

    @Override // defpackage.if2
    public final Uri getUri() {
        of2 of2Var = this.e;
        if (of2Var != null) {
            return of2Var.a;
        }
        return null;
    }

    @Override // defpackage.ef2
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        String str = n6b.a;
        System.arraycopy(bArr2, this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        o(iMin);
        return iMin;
    }
}
