package defpackage;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import com.hwpo_training_app.R;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rv6 extends oq1 {
    public final View A;
    public final qv6 B;
    public mh4<g2b> x;
    public cx6 y;
    public long z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends vg7 {
        public final t72 a;
        public final qt<Float, bw> b;
        public final l0 c;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackCancelled$1", f = "ModalBottomSheet.android.kt", l = {638}, m = "invokeSuspend")
        public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;

            public a(r02<? super a> r02Var) {
                super(2, r02Var);
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return b.this.new a(r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i == 0) {
                    dv8.b(obj);
                    qt<Float, bw> qtVar = b.this.b;
                    Float f = new Float(0.0f);
                    this.t = 1;
                    Object objC = qt.c(qtVar, f, null, null, this, 14);
                    v72 v72Var = v72.t;
                    if (objC == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
                return g2b.a;
            }
        }

        /* JADX INFO: renamed from: rv6$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackProgressed$1", f = "ModalBottomSheet.android.kt", l = {627}, m = "invokeSuspend")
        public static final class C0236b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;
            public final /* synthetic */ gh0 v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0236b(gh0 gh0Var, r02<? super C0236b> r02Var) {
                super(2, r02Var);
                this.v = gh0Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return b.this.new C0236b(this.v, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((C0236b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i == 0) {
                    dv8.b(obj);
                    qt<Float, bw> qtVar = b.this.b;
                    Float f = new Float(qh0.a.a(this.v.c));
                    this.t = 1;
                    Object objE = qtVar.e(this, f);
                    v72 v72Var = v72.t;
                    if (objE == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1", f = "ModalBottomSheet.android.kt", l = {620}, m = "invokeSuspend")
        public static final class c extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;
            public final /* synthetic */ gh0 v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(gh0 gh0Var, r02<? super c> r02Var) {
                super(2, r02Var);
                this.v = gh0Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return b.this.new c(this.v, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((c) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i == 0) {
                    dv8.b(obj);
                    qt<Float, bw> qtVar = b.this.b;
                    Float f = new Float(qh0.a.a(this.v.c));
                    this.t = 1;
                    Object objE = qtVar.e(this, f);
                    v72 v72Var = v72.t;
                    if (objE == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
                return g2b.a;
            }
        }

        public b(boolean z, t72 t72Var, qt qtVar, l0 l0Var) {
            super(z);
            this.a = t72Var;
            this.b = qtVar;
            this.c = l0Var;
        }

        @Override // defpackage.vg7
        public final void handleOnBackCancelled() {
            oy0.d(this.a, null, null, new a(null), 3);
        }

        @Override // defpackage.vg7
        public final void handleOnBackPressed() {
            this.c.invoke();
        }

        @Override // defpackage.vg7
        public final void handleOnBackProgressed(gh0 gh0Var) {
            oy0.d(this.a, null, null, new C0236b(gh0Var, null), 3);
        }

        @Override // defpackage.vg7
        public final void handleOnBackStarted(gh0 gh0Var) {
            oy0.d(this.a, null, null, new c(gh0Var, null), 3);
        }
    }

    public rv6() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv6(mh4 mh4Var, cx6 cx6Var, long j, View view, tq5 tq5Var, tx2 tx2Var, UUID uuid, qt qtVar, t72 t72Var) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        boolean z = false;
        this.x = mh4Var;
        this.y = cx6Var;
        this.z = j;
        this.A = view;
        Window window = getWindow();
        if (window == null) {
            aa0.c("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        jmb.a(window, false);
        qv6 qv6Var = new qv6(getContext(), window);
        qv6Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        qv6Var.setClipChildren(false);
        qv6Var.setElevation(tx2Var.U0(8.0f));
        qv6Var.setOutlineProvider(new a());
        this.B = qv6Var;
        setContentView(qv6Var);
        qv6Var.setTag(R.id.view_tree_lifecycle_owner, vib.a(view));
        qv6Var.setTag(R.id.view_tree_view_model_store_owner, ty.e(view));
        qv6Var.setTag(R.id.view_tree_saved_state_registry_owner, sy.a(view));
        d(this.x, this.y, this.z, tq5Var);
        yv9 yv9Var = new yv9(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        x10 dnbVar = i >= 35 ? new dnb(window, yv9Var) : i >= 30 ? new bnb(window, yv9Var) : i >= 26 ? new anb(window, yv9Var) : new zmb(window, yv9Var);
        this.y.getClass();
        long j2 = this.z;
        long j3 = uh1.j;
        dnbVar.h(!uh1.c(j2, j3) && ((double) u7d.k(j2)) <= 0.5d);
        this.y.getClass();
        long j4 = this.z;
        if (!uh1.c(j4, j3) && u7d.k(j4) <= 0.5d) {
            z = true;
        }
        dnbVar.g(z);
        getOnBackPressedDispatcher().a(this, new b(this.y.b, t72Var, qtVar, new l0(1, this)));
    }

    public final void d(mh4<g2b> mh4Var, cx6 cx6Var, long j, tq5 tq5Var) {
        this.x = mh4Var;
        this.y = cx6Var;
        this.z = j;
        s89 s89Var = cx6Var.a;
        ViewGroup.LayoutParams layoutParams = this.A.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = s89Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z = true;
            } else {
                if (iOrdinal != 2) {
                    u.b();
                    return;
                }
                z = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int iOrdinal2 = tq5Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else if (iOrdinal2 != 1) {
            u.b();
            return;
        }
        this.B.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.x.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
