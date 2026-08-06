package defpackage;

import android.os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w02<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {
    public final e41 t;

    public w02(e41 e41Var) {
        super(false);
        this.t = e41Var;
    }

    public final void onError(E e) {
        if (compareAndSet(false, true)) {
            this.t.resumeWith(dv8.a(e));
        }
    }

    public final void onResult(R r) {
        if (compareAndSet(false, true)) {
            this.t.resumeWith(r);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
