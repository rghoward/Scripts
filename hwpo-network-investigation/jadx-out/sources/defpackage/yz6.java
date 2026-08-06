package defpackage;

import com.intercom.twig.BuildConfig;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yz6 implements z4a {
    public final pt7 a = new pt7();

    @Override // defpackage.z4a
    public final void b(byte[] bArr, int i, int i2, z4a.b bVar, ry1<mc2> ry1Var) {
        ec2 ec2VarA;
        pt7 pt7Var = this.a;
        pt7Var.K(bArr, i2 + i);
        pt7Var.M(i);
        ArrayList arrayList = new ArrayList();
        while (pt7Var.a() > 0) {
            xl7.f("Incomplete Mp4Webvtt Top Level box header found.", pt7Var.a() >= 8);
            int iM = pt7Var.m();
            if (pt7Var.m() == 1987343459) {
                int i3 = iM - 8;
                CharSequence charSequenceF = null;
                ec2.a aVarA = null;
                while (i3 > 0) {
                    xl7.f("Incomplete vtt cue box header found.", i3 >= 8);
                    int iM2 = pt7Var.m();
                    int iM3 = pt7Var.m();
                    int i4 = iM2 - 8;
                    byte[] bArr2 = pt7Var.a;
                    int i5 = pt7Var.b;
                    String str = n6b.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    pt7Var.N(i4);
                    i3 = (i3 - 8) - i4;
                    if (iM3 == 1937011815) {
                        klb.d dVar = new klb.d();
                        klb.e(str2, dVar);
                        aVarA = dVar.a();
                    } else if (iM3 == 1885436268) {
                        charSequenceF = klb.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = BuildConfig.FLAVOR;
                }
                if (aVarA != null) {
                    aVarA.a = charSequenceF;
                    aVarA.b = null;
                    ec2VarA = aVarA.a();
                } else {
                    Pattern pattern = klb.a;
                    klb.d dVar2 = new klb.d();
                    dVar2.c = charSequenceF;
                    ec2VarA = dVar2.a().a();
                }
                arrayList.add(ec2VarA);
            } else {
                pt7Var.N(iM - 8);
            }
        }
        ry1Var.accept(new mc2(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
