package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class od9 {
    public static final m98 a(String str, j98 j98Var) {
        j98Var.getClass();
        if (z2a.w(str)) {
            z90.a("Blank serial names are prohibited");
            return null;
        }
        Object it = ((nh6) n98.a.values()).iterator();
        while (((kh6.d) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((kh6.f) it).next();
            if (str.equals(kSerializer.getDescriptor().a())) {
                StringBuilder sbA = aa.a("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbA.append(ll8.a(kSerializer.getClass()).c());
                sbA.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                z90.a(s2a.b(sbA.toString()));
                return null;
            }
        }
        return new m98(str, j98Var);
    }

    public static final ld9 b(String str, pd9 pd9Var, SerialDescriptor[] serialDescriptorArr, oh4 oh4Var) {
        pd9Var.getClass();
        if (z2a.w(str)) {
            z90.a("Blank serial names are prohibited");
            return null;
        }
        if (pd9Var.equals(g3a.a.a)) {
            z90.a("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        td1 td1Var = new td1(str);
        oh4Var.invoke(td1Var);
        return new ld9(str, pd9Var, td1Var.c.size(), u30.E(serialDescriptorArr), td1Var);
    }

    public static ld9 c(String str, pd9 pd9Var, SerialDescriptor[] serialDescriptorArr) {
        pd9Var.getClass();
        if (z2a.w(str)) {
            z90.a("Blank serial names are prohibited");
            return null;
        }
        if (pd9Var.equals(g3a.a.a)) {
            z90.a("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        td1 td1Var = new td1(str);
        g2b g2bVar = g2b.a;
        return new ld9(str, pd9Var, td1Var.c.size(), u30.E(serialDescriptorArr), td1Var);
    }
}
