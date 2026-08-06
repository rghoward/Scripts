package defpackage;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hj6 {
    public final a a;
    public final fj6 b;
    public final View c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public OnBackInvokedCallback a;

        public OnBackInvokedCallback a(final fj6 fj6Var) {
            Objects.requireNonNull(fj6Var);
            return new OnBackInvokedCallback() { // from class: gj6
                public final void onBackInvoked() {
                    fj6Var.a();
                }
            };
        }

        public void b(fj6 fj6Var, View view, boolean z) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackA = a(fj6Var);
                this.a = onBackInvokedCallbackA;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? 1000000 : 0, onBackInvokedCallbackA);
            }
        }

        public void c(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.a == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.a);
            this.a = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends a {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements OnBackAnimationCallback {
            public final /* synthetic */ fj6 a;

            public a(fj6 fj6Var) {
                this.a = fj6Var;
            }

            public final void onBackCancelled() {
                if (b.this.a != null) {
                    this.a.d();
                }
            }

            public final void onBackInvoked() {
                this.a.a();
            }

            public final void onBackProgressed(BackEvent backEvent) {
                if (b.this.a != null) {
                    this.a.b(new gh0(backEvent));
                }
            }

            public final void onBackStarted(BackEvent backEvent) {
                if (b.this.a != null) {
                    this.a.c(new gh0(backEvent));
                }
            }
        }

        @Override // hj6.a
        public final OnBackInvokedCallback a(fj6 fj6Var) {
            return new a(fj6Var);
        }
    }

    public hj6(fj6 fj6Var, View view) {
        int i = Build.VERSION.SDK_INT;
        this.a = i >= 34 ? new b() : i >= 33 ? new a() : null;
        this.b = fj6Var;
        this.c = view;
    }
}
