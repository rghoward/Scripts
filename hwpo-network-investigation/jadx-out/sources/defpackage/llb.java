package defpackage;

import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class llb implements js3 {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final apa b;
    public final z4a.a d;
    public final boolean e;
    public ls3 f;
    public int h;
    public final pt7 c = new pt7();
    public byte[] g = new byte[1024];

    public llb(String str, apa apaVar, z4a.a aVar, boolean z) {
        this.a = str;
        this.b = apaVar;
        this.d = aVar;
        this.e = z;
    }

    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) throws ut7 {
        String strN;
        this.f.getClass();
        int iA = (int) ks3Var.a();
        int i2 = this.h;
        byte[] bArr = this.g;
        if (i2 == bArr.length) {
            this.g = Arrays.copyOf(bArr, ((iA != -1 ? iA : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i3 = this.h;
        int i4 = ks3Var.read(bArr2, i3, bArr2.length - i3);
        if (i4 != -1) {
            int i5 = this.h + i4;
            this.h = i5;
            if (iA == -1 || i5 != iA) {
                return 0;
            }
        }
        pt7 pt7Var = new pt7(this.g);
        nlb.d(pt7Var);
        String strN2 = pt7Var.n(StandardCharsets.UTF_8);
        long jU = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strN2)) {
                while (true) {
                    String strN3 = pt7Var.n(StandardCharsets.UTF_8);
                    if (strN3 == null) {
                        break;
                    }
                    if (nlb.a.matcher(strN3).matches()) {
                        do {
                            strN = pt7Var.n(StandardCharsets.UTF_8);
                            if (strN == null) {
                                break;
                            }
                        } while (!strN.isEmpty());
                    } else {
                        Matcher matcher2 = klb.a.matcher(strN3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    h(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = nlb.c(strGroup);
                String str = n6b.a;
                long jB = this.b.b(n6b.U((jU + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                hsa hsaVarH = h(jB - jC2);
                byte[] bArr3 = this.g;
                int i6 = this.h;
                pt7 pt7Var2 = this.c;
                pt7Var2.K(bArr3, i6);
                hsaVarH.e(this.h, pt7Var2);
                hsaVarH.a(jB, 1, this.h, 0, null);
                return -1;
            }
            if (strN2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(strN2);
                if (!matcher3.find()) {
                    throw ut7.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strN2));
                }
                Matcher matcher4 = j.matcher(strN2);
                if (!matcher4.find()) {
                    throw ut7.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strN2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = nlb.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j2 = Long.parseLong(strGroup3);
                String str2 = n6b.a;
                jU = n6b.U(j2, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strN2 = pt7Var.n(StandardCharsets.UTF_8);
        }
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        zq2 zq2Var = (zq2) ks3Var;
        zq2Var.f(this.g, 0, 6, false);
        byte[] bArr = this.g;
        pt7 pt7Var = this.c;
        pt7Var.K(bArr, 6);
        if (nlb.a(pt7Var)) {
            return true;
        }
        zq2Var.f(this.g, 6, 3, false);
        pt7Var.K(this.g, 9);
        return nlb.a(pt7Var);
    }

    @Override // defpackage.js3
    public final void e(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        if (this.e) {
            ls3Var = new a5a(ls3Var, this.d);
        }
        this.f = ls3Var;
        ls3Var.t(new t89.b(-9223372036854775807L));
    }

    public final hsa h(long j2) {
        hsa hsaVarP = this.f.p(0, 3);
        id4.a aVar = new id4.a();
        aVar.n = fv6.n("text/vtt");
        aVar.d = this.a;
        aVar.s = j2;
        hy1.b(aVar, hsaVarP);
        this.f.k();
        return hsaVarP;
    }

    @Override // defpackage.js3
    public final void a() {
    }
}
