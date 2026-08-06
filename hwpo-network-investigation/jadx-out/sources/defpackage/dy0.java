package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dy0 {
    public static final ha1<Object> a = new ha1<>(-1, null, null, 0);
    public static final int b = ec1.c(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = ec1.c(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final k7a d = new k7a("BUFFERED");
    public static final k7a e = new k7a("SHOULD_BUFFER");
    public static final k7a f = new k7a("S_RESUMING_BY_RCV");
    public static final k7a g = new k7a("RESUMING_BY_EB");
    public static final k7a h = new k7a("POISONED");
    public static final k7a i = new k7a("DONE_RCV");
    public static final k7a j = new k7a("INTERRUPTED_SEND");
    public static final k7a k = new k7a("INTERRUPTED_RCV");
    public static final k7a l = new k7a("CHANNEL_CLOSED");
    public static final k7a m = new k7a("SUSPEND");
    public static final k7a n = new k7a("SUSPEND_NO_WAITER");
    public static final k7a o = new k7a("FAILED");
    public static final k7a p = new k7a("NO_RECEIVE_RESULT");
    public static final k7a q = new k7a("CLOSE_HANDLER_CLOSED");
    public static final k7a r = new k7a("CLOSE_HANDLER_INVOKED");
    public static final k7a s = new k7a("NO_CLOSE_CAUSE");

    public static final <T> boolean a(c41<? super T> c41Var, T t, ei4<? super Throwable, ? super T, ? super h72, g2b> ei4Var) {
        k7a k7aVarE = c41Var.e(t, ei4Var);
        if (k7aVarE == null) {
            return false;
        }
        c41Var.x(k7aVarE);
        return true;
    }
}
