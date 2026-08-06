package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j96 implements i96 {
    @Override // defpackage.i96
    public final xi5.c a(long j, Object obj) {
        xi5.c cVar = (xi5.c) i3b.c.h(j, obj);
        if (cVar.s()) {
            return cVar;
        }
        int size = cVar.size();
        xi5.c cVarH = cVar.h(size == 0 ? 10 : size * 2);
        i3b.o(j, obj, cVarH);
        return cVarH;
    }

    @Override // defpackage.i96
    public final void b(long j, Object obj, Object obj2) {
        i3b.e eVar = i3b.c;
        xi5.c cVarH = (xi5.c) eVar.h(j, obj);
        xi5.c cVar = (xi5.c) eVar.h(j, obj2);
        int size = cVarH.size();
        int size2 = cVar.size();
        if (size > 0 && size2 > 0) {
            if (!cVarH.s()) {
                cVarH = cVarH.h(size2 + size);
            }
            cVarH.addAll(cVar);
        }
        if (size > 0) {
            cVar = cVarH;
        }
        i3b.o(j, obj, cVar);
    }

    @Override // defpackage.i96
    public final void c(long j, Object obj) {
        ((xi5.c) i3b.c.h(j, obj)).g();
    }
}
