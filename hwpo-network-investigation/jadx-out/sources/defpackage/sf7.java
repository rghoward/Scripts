package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sf7 {
    public static final <T extends ox6.c & rf7> void a(T t, mh4<g2b> mh4Var) {
        tf7 tf7Var = t.z;
        if (tf7Var == null) {
            tf7Var = new tf7(t);
            t.z = tf7Var;
        }
        un7 snapshotObserver = ew2.g(t).getSnapshotObserver();
        snapshotObserver.a.d(tf7Var, tf7.a.u, mh4Var);
    }
}
