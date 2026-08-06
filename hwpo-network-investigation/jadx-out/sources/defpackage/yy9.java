package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class yy9 {
    public static final /* synthetic */ int a = 0;

    static {
        Object aVar;
        Object aVar2;
        Exception exc = new Exception();
        String simpleName = qtb.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            aVar = ak0.class.getCanonicalName();
        } catch (Throwable th) {
            aVar = new av8.a(th);
        }
        if (av8.a(aVar) != null) {
            aVar = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            aVar2 = yy9.class.getCanonicalName();
        } catch (Throwable th2) {
            aVar2 = new av8.a(th2);
        }
        if (av8.a(aVar2) != null) {
            aVar2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
