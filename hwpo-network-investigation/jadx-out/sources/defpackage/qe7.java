package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qe7 implements mh4 {
    @Override // defpackage.mh4
    public final Object invoke() {
        g3a.d dVar = g3a.d.a;
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        dVar.getClass();
        if (z2a.w("kotlin.Unit")) {
            z90.a("Blank serial names are prohibited");
            return null;
        }
        if (dVar == g3a.a.a) {
            z90.a("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        td1 td1Var = new td1("kotlin.Unit");
        td1Var.b = hf3.t;
        g2b g2bVar = g2b.a;
        return new ld9("kotlin.Unit", dVar, td1Var.c.size(), u30.E(serialDescriptorArr), td1Var);
    }
}
