package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b18 extends CancellationException {
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b18(String str, int i) {
        super(str);
        this.t = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.t) {
            case 0:
                setStackTrace(c18.a);
                break;
            case 1:
                setStackTrace(f18.a);
                break;
            default:
                setStackTrace(d18.a);
                break;
        }
        return this;
    }
}
