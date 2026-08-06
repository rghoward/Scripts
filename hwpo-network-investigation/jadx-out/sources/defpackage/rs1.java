package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rs1 implements ScrollCaptureCallback {
    public final ub9 a;
    public final gg5 b;
    public final g69 c;
    public final cm d;
    public final o02 e;
    public final cm8 f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {188}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ Runnable v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Runnable runnable, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = runnable;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return rs1.this.new a(this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            rs1 rs1Var = rs1.this;
            if (i == 0) {
                dv8.b(obj);
                cm8 cm8Var = rs1Var.f;
                this.t = 1;
                Object objA = cm8Var.a(0.0f - cm8Var.c, this);
                v72 v72Var = v72.t;
                if (objA != v72Var) {
                    objA = g2b.a;
                }
                if (objA == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            rs1Var.c.a.setValue(Boolean.FALSE);
            this.v.run();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {120}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ ScrollCaptureSession v;
        public final /* synthetic */ Rect w;
        public final /* synthetic */ Consumer<Rect> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, r02<? super b> r02Var) {
            super(2, r02Var);
            this.v = scrollCaptureSession;
            this.w = rect;
            this.x = consumer;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return rs1.this.new b(this.v, this.w, this.x, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                ScrollCaptureSession scrollCaptureSession = this.v;
                Rect rect = this.w;
                gg5 gg5Var = new gg5(rect.left, rect.top, rect.right, rect.bottom);
                this.t = 1;
                obj = rs1.a(rs1.this, scrollCaptureSession, gg5Var, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            this.x.accept(h40.c((gg5) obj));
            return g2b.a;
        }
    }

    public rs1(ub9 ub9Var, gg5 gg5Var, o02 o02Var, g69 g69Var, cm cmVar) {
        this.a = ub9Var;
        this.b = gg5Var;
        this.c = g69Var;
        this.d = cmVar;
        this.e = new o02(o02Var.t.c0(e13.t));
        this.f = new cm8(gg5Var.b(), new us1(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(rs1 rs1Var, ScrollCaptureSession scrollCaptureSession, gg5 gg5Var, u02 u02Var) throws Throwable {
        ss1 ss1Var;
        int i;
        int i2;
        Object objA;
        ScrollCaptureSession scrollCaptureSession2;
        int i3;
        gg5 gg5Var2;
        int i4;
        int iG;
        int iG2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (u02Var instanceof ss1) {
            ss1Var = (ss1) u02Var;
            int i7 = ss1Var.z;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                ss1Var.z = i7 - Integer.MIN_VALUE;
            } else {
                ss1Var = new ss1(rs1Var, u02Var);
            }
        } else {
            ss1Var = new ss1(rs1Var, u02Var);
        }
        Object obj = ss1Var.x;
        int i8 = ss1Var.z;
        v72 v72Var = v72.t;
        if (i8 == 0) {
            dv8.b(obj);
            i = gg5Var.b;
            i2 = gg5Var.d;
            cm8 cm8Var = rs1Var.f;
            ss1Var.t = scrollCaptureSession;
            ss1Var.u = gg5Var;
            ss1Var.v = i;
            ss1Var.w = i2;
            ss1Var.z = 1;
            int i9 = cm8Var.a;
            if (i > i2) {
                ca0.a(u.a(i, i2, "Expected min=", " ≤ max="));
                return null;
            }
            int i10 = i2 - i;
            if (i10 > i9) {
                ca0.a(u.a(i10, i9, "Expected range (", ") to be ≤ viewportSize="));
                return null;
            }
            float f = i;
            float f2 = cm8Var.c;
            if (f < f2 || i2 > i9 + f2) {
                objA = cm8Var.a((((i10 / 2) + i) - (i9 / 2)) - f2, ss1Var);
                if (objA != v72Var) {
                    objA = g2b.a;
                }
                if (objA != v72Var) {
                    objA = g2b.a;
                }
            } else {
                objA = g2b.a;
            }
            if (objA != v72Var) {
            }
            return v72Var;
        }
        if (i8 == 1) {
            int i11 = ss1Var.w;
            int i12 = ss1Var.v;
            gg5 gg5Var3 = ss1Var.u;
            ScrollCaptureSession scrollCaptureSession3 = (ScrollCaptureSession) ss1Var.t;
            dv8.b(obj);
            i = i12;
            gg5Var = gg5Var3;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSession3;
        } else {
            if (i8 != 2) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = ss1Var.w;
            i4 = ss1Var.v;
            gg5Var2 = ss1Var.u;
            scrollCaptureSession2 = (ScrollCaptureSession) ss1Var.t;
            dv8.b(obj);
        }
        cm8 cm8Var2 = rs1Var.f;
        iG = uh8.g(i4 - wk6.b(cm8Var2.c), 0, cm8Var2.a);
        cm8 cm8Var3 = rs1Var.f;
        iG2 = uh8.g(i3 - wk6.b(cm8Var3.c), 0, cm8Var3.a);
        i5 = gg5Var2.a;
        i6 = gg5Var2.c;
        if (iG == iG2) {
            return gg5.e;
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iG);
            gg5 gg5Var4 = rs1Var.b;
            canvasLockHardwareCanvas.translate(-gg5Var4.a, -gg5Var4.b);
            rs1Var.d.getRootView().draw(canvasLockHardwareCanvas);
            int iB = wk6.b(rs1Var.f.c);
            return new gg5(i5, iG + iB, i6, iG2 + iB);
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        ss1Var.t = scrollCaptureSession;
        ss1Var.u = gg5Var;
        ss1Var.v = i;
        ss1Var.w = i2;
        ss1Var.z = 2;
        if (zx6.a(ss1Var.getContext()).u(ts1.u, ss1Var) != v72Var) {
            scrollCaptureSession2 = scrollCaptureSession;
            i3 = i2;
            gg5Var2 = gg5Var;
            i4 = i;
            cm8 cm8Var4 = rs1Var.f;
            iG = uh8.g(i4 - wk6.b(cm8Var4.c), 0, cm8Var4.a);
            cm8 cm8Var5 = rs1Var.f;
            iG2 = uh8.g(i3 - wk6.b(cm8Var5.c), 0, cm8Var5.a);
            i5 = gg5Var2.a;
            i6 = gg5Var2.c;
            if (iG == iG2) {
                return gg5.e;
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iG);
            gg5 gg5Var5 = rs1Var.b;
            canvasLockHardwareCanvas.translate(-gg5Var5.a, -gg5Var5.b);
            rs1Var.d.getRootView().draw(canvasLockHardwareCanvas);
            int iB2 = wk6.b(rs1Var.f.c);
            return new gg5(i5, iG + iB2, i6, iG2 + iB2);
        }
        return v72Var;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        oy0.d(this.e, xb7.u, null, new a(runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer<Rect> consumer) {
        final dz9 dz9VarD = oy0.d(this.e, null, null, new b(scrollCaptureSession, rect, consumer, null), 3);
        dz9VarD.j0(new ws1(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: vs1
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                dz9VarD.k(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer<Rect> consumer) {
        consumer.accept(h40.c(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.c = 0.0f;
        this.c.a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
