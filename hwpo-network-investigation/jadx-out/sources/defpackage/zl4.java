package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zl4 extends t73<xl4> {
    @Override // defpackage.kt8
    public final void a() {
        o30 o30Var;
        o30 o30Var2;
        o30 o30Var3;
        xl4 xl4Var = (xl4) this.t;
        xl4Var.stop();
        xl4Var.w = true;
        cm4 cm4Var = xl4Var.t.a;
        lq8 lq8Var = cm4Var.d;
        cm4Var.c.clear();
        Bitmap bitmap = cm4Var.l;
        if (bitmap != null) {
            cm4Var.e.d(bitmap);
            cm4Var.l = null;
        }
        cm4Var.f = false;
        cm4.a aVar = cm4Var.i;
        if (aVar != null) {
            lq8Var.l(aVar);
            cm4Var.i = null;
        }
        cm4.a aVar2 = cm4Var.k;
        if (aVar2 != null) {
            lq8Var.l(aVar2);
            cm4Var.k = null;
        }
        cm4.a aVar3 = cm4Var.n;
        if (aVar3 != null) {
            lq8Var.l(aVar3);
            cm4Var.n = null;
        }
        gz9 gz9Var = cm4Var.a;
        wl4.a aVar4 = gz9Var.c;
        gz9Var.l = null;
        byte[] bArr = gz9Var.i;
        if (bArr != null && (o30Var3 = ((sl4) aVar4).b) != null) {
            o30Var3.put(bArr);
        }
        int[] iArr = gz9Var.j;
        if (iArr != null && (o30Var2 = ((sl4) aVar4).b) != null) {
            o30Var2.put(iArr);
        }
        Bitmap bitmap2 = gz9Var.m;
        if (bitmap2 != null) {
            ((sl4) aVar4).a.d(bitmap2);
        }
        gz9Var.m = null;
        gz9Var.d = null;
        gz9Var.s = null;
        byte[] bArr2 = gz9Var.e;
        if (bArr2 != null && (o30Var = ((sl4) aVar4).b) != null) {
            o30Var.put(bArr2);
        }
        cm4Var.j = true;
    }

    @Override // defpackage.t73, defpackage.fc5
    public final void b() {
        ((xl4) this.t).t.a.l.prepareToDraw();
    }

    @Override // defpackage.kt8
    public final Class<xl4> c() {
        return xl4.class;
    }

    @Override // defpackage.kt8
    public final int getSize() {
        cm4 cm4Var = ((xl4) this.t).t.a;
        gz9 gz9Var = cm4Var.a;
        return (gz9Var.j.length * 4) + gz9Var.d.limit() + gz9Var.i.length + cm4Var.o;
    }
}
