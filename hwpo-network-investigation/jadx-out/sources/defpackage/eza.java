package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.intercom.twig.BuildConfig;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eza implements z4a {
    public final pt7 a = new pt7();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;

    public eza(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & MessagePack.Code.EXT_TIMESTAMP) << 24) | ((bArr[27] & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((bArr[28] & MessagePack.Code.EXT_TIMESTAMP) << 8) | (bArr[29] & MessagePack.Code.EXT_TIMESTAMP);
        int length = bArr.length - 43;
        String str = n6b.a;
        this.e = "Serif".equals(new String(bArr, 43, length, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = n6b.h(((bArr[11] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[10] & MessagePack.Code.EXT_TIMESTAMP) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z4a
    public final void b(byte[] bArr, int i, int i2, z4a.b bVar, ry1<mc2> ry1Var) {
        String strX;
        int i3;
        pt7 pt7Var = this.a;
        pt7Var.K(bArr, i + i2);
        pt7Var.M(i);
        int i4 = 1;
        int i5 = 0;
        int i6 = 2;
        xl7.g(pt7Var.a() >= 2);
        int iG = pt7Var.G();
        if (iG == 0) {
            strX = BuildConfig.FLAVOR;
        } else {
            int i7 = pt7Var.b;
            Charset charsetI = pt7Var.I();
            int i8 = iG - (pt7Var.b - i7);
            if (charsetI == null) {
                charsetI = StandardCharsets.UTF_8;
            }
            strX = pt7Var.x(i8, charsetI);
        }
        if (strX.isEmpty()) {
            k95.b bVar2 = k95.u;
            ry1Var.accept(new mc2(-9223372036854775807L, -9223372036854775807L, ul8.x));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strX);
        d(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        c(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fH = this.f;
        while (pt7Var.a() >= 8) {
            int i9 = pt7Var.b;
            int iM = pt7Var.m();
            int iM2 = pt7Var.m();
            if (iM2 == 1937013100) {
                xl7.g(pt7Var.a() >= i6 ? i4 : i5);
                int iG2 = pt7Var.G();
                int i10 = i5;
                while (i10 < iG2) {
                    xl7.g(pt7Var.a() >= 12 ? i4 : i5);
                    int iG3 = pt7Var.G();
                    int iG4 = pt7Var.G();
                    pt7Var.N(i6);
                    int i11 = i10;
                    int iZ = pt7Var.z();
                    pt7Var.N(i4);
                    int iM3 = pt7Var.m();
                    if (iG4 > spannableStringBuilder.length()) {
                        StringBuilder sbB = t43.b(iG4, "Truncating styl end (", ") to cueText.length() (");
                        sbB.append(spannableStringBuilder.length());
                        sbB.append(").");
                        md6.g("Tx3gParser", sbB.toString());
                        iG4 = spannableStringBuilder.length();
                    }
                    if (iG3 >= iG4) {
                        md6.g("Tx3gParser", a30.b("Ignoring styl with start (", ") >= end (", ").", iG3, iG4));
                    } else {
                        int i12 = iG4;
                        d(spannableStringBuilder, iZ, this.c, iG3, i12, 0);
                        c(spannableStringBuilder, iM3, this.d, iG3, i12, 0);
                    }
                    i10 = i11 + 1;
                    i4 = 1;
                    i5 = 0;
                    i6 = 2;
                }
                i3 = i6;
            } else if (iM2 == 1952608120 && this.b) {
                i3 = 2;
                xl7.g(pt7Var.a() >= 2);
                fH = n6b.h(pt7Var.G() / this.g, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            pt7Var.M(i9 + iM);
            i6 = i3;
            i4 = 1;
            i5 = 0;
        }
        ec2.a aVar = new ec2.a();
        aVar.a = spannableStringBuilder;
        aVar.b = null;
        aVar.e = fH;
        aVar.f = 0;
        aVar.g = 0;
        ry1Var.accept(new mc2(-9223372036854775807L, -9223372036854775807L, k95.v(aVar.a())));
    }
}
