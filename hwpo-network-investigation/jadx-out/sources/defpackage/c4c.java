package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c4c extends c5c {
    public final transient int v;
    public final transient int w;
    public final /* synthetic */ c5c x;

    public c4c(c5c c5cVar, int i, int i2) {
        this.x = c5cVar;
        this.v = i;
        this.w = i2;
    }

    @Override // defpackage.a0c
    public final Object[] d() {
        return this.x.d();
    }

    @Override // defpackage.a0c
    public final int e() {
        return this.x.e() + this.v;
    }

    @Override // defpackage.a0c
    public final int f() {
        return this.x.e() + this.v + this.w;
    }

    @Override // java.util.List
    public final Object get(int i) {
        p1d.a(i, this.w);
        return this.x.get(i + this.v);
    }

    @Override // defpackage.c5c, java.util.List
    /* JADX INFO: renamed from: k */
    public final c5c subList(int i, int i2) {
        p1d.b(i, i2, this.w);
        int i3 = this.v;
        return this.x.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
