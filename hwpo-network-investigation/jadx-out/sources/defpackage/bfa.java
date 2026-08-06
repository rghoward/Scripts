package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bfa {
    public final u56 a;
    public final qga b;
    public final kha c;
    public final boolean d;
    public final boolean e;
    public final kja f;
    public final ag7 g;
    public final z1b h;
    public final vm2 i;
    public final vo5.a j;
    public final oh4<kha, g2b> k;
    public final int l;

    public bfa() {
        throw null;
    }

    public bfa(u56 u56Var, qga qgaVar, kha khaVar, boolean z, boolean z2, kja kjaVar, ag7 ag7Var, z1b z1bVar, vm2 vm2Var, oh4 oh4Var, int i) {
        this.a = u56Var;
        this.b = qgaVar;
        this.c = khaVar;
        this.d = z;
        this.e = z2;
        this.f = kjaVar;
        this.g = ag7Var;
        this.h = z1bVar;
        this.i = vm2Var;
        this.j = vo5.a;
        this.k = oh4Var;
        this.l = i;
    }

    public final void a(List<? extends ra3> list) {
        nd3 nd3Var = this.a.d;
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, new zz3());
        this.k.invoke(nd3Var.a(arrayList));
    }
}
