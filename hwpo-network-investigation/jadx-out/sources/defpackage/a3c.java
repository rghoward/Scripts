package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a3c extends c5c {
    public final transient c5c v;

    public a3c(c5c c5cVar) {
        this.v = c5cVar;
    }

    @Override // defpackage.c5c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.v.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        c5c c5cVar = this.v;
        p1d.a(i, c5cVar.size());
        return c5cVar.get((c5cVar.size() - 1) - i);
    }

    @Override // defpackage.c5c, java.util.List
    public final int indexOf(Object obj) {
        c5c c5cVar = this.v;
        int iLastIndexOf = c5cVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (c5cVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.c5c
    public final c5c j() {
        return this.v;
    }

    @Override // defpackage.c5c, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final c5c subList(int i, int i2) {
        c5c c5cVar = this.v;
        p1d.b(i, i2, c5cVar.size());
        return c5cVar.subList(c5cVar.size() - i2, c5cVar.size() - i).j();
    }

    @Override // defpackage.c5c, java.util.List
    public final int lastIndexOf(Object obj) {
        c5c c5cVar = this.v;
        int iIndexOf = c5cVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (c5cVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.v.size();
    }
}
