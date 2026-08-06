package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m63 {
    public static final a a = new a(3, null);
    public static final b b = new b(3, null);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ei4<t72, vf7, r02<? super g2b>, Object> {
        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, vf7 vf7Var, r02<? super g2b> r02Var) {
            long j = vf7Var.a;
            return new a(3, r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ei4<t72, Float, r02<? super g2b>, Object> {
        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, Float f, r02<? super g2b> r02Var) {
            f.floatValue();
            return new b(3, r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            return g2b.a;
        }
    }

    public static final long a(long j) {
        return sdb.a(Float.isNaN(rdb.b(j)) ? 0.0f : rdb.b(j), Float.isNaN(rdb.c(j)) ? 0.0f : rdb.c(j));
    }
}
