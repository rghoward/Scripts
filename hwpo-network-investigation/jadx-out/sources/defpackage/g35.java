package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g35 extends c87 {
    @Override // defpackage.c87
    public final void a(String str, h5b h5bVar, String str2, id7 id7Var, boolean z, ki7 ki7Var, r25.a aVar, r25.b bVar, r25.c cVar, r25.d dVar, r25.e eVar) {
        if (str == null || z2a.w(str)) {
            aVar.invoke();
            return;
        }
        if (ki7Var == ki7.t) {
            dVar.invoke();
            return;
        }
        if (ki7Var == ki7.u) {
            dVar.invoke();
            eVar.invoke();
            return;
        }
        if (h5bVar != null && h5bVar.k == null) {
            dVar.invoke();
            return;
        }
        if (str2 == null || z2a.w(str2) || id7Var == null || id7Var != id7.NOTIFICATION_CREATED) {
            cVar.invoke();
        } else {
            bVar.invoke(str2, Boolean.valueOf(z));
        }
    }
}
