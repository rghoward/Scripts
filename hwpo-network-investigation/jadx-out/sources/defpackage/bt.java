package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import com.hwpo_training_app.R;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class bt extends ViewGroup implements o97, ls1, nn7, pg7 {
    public ox6 A;
    public oh4<? super ox6, g2b> B;
    public tx2 C;
    public oh4<? super tx2, g2b> D;
    public m76 E;
    public f19 F;
    public final int[] G;
    public long H;
    public umb I;
    public oh4<? super sk8, g2b> J;
    public final q K;
    public final p L;
    public oh4<? super Boolean, g2b> M;
    public final int[] N;
    public int O;
    public int P;
    public final p97 Q;
    public boolean R;
    public final qr5 S;
    public final c97 t;
    public final View u;
    public final mn7 v;
    public mh4<g2b> w;
    public boolean x;
    public mh4<g2b> y;
    public mh4<g2b> z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends pmb.b {
        public final /* synthetic */ zgb v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zgb zgbVar) {
            super(1);
            this.v = zgbVar;
        }

        @Override // pmb.b
        public final umb d(umb umbVar, List<pmb> list) {
            return this.v.f(umbVar);
        }

        @Override // pmb.b
        public final pmb.a e(pmb pmbVar, pmb.a aVar) {
            fd5 fd5Var = this.v.S.Y.c;
            if (fd5Var.n0.G) {
                long jC = cg5.c(fd5Var.a0(0L));
                int i = (int) (jC >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jC & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jA = rq5.d(fd5Var).a();
                int i3 = (int) (jA >> 32);
                int i4 = (int) (jA & 4294967295L);
                long j = fd5Var.v;
                long jC2 = cg5.c(fd5Var.a0((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jC2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (jC2 & 4294967295L));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return new pmb.a(bt.e(aVar.a, i, i2, i5, i7), bt.e(aVar.b, i, i2, i5, i7));
                }
            }
            return aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements oh4<bt, g2b> {
        public static final b u = new b(1);

        @Override // defpackage.oh4
        public final g2b invoke(bt btVar) {
            bt btVar2 = btVar;
            Handler handler = btVar2.getHandler();
            final q qVar = btVar2.K;
            handler.post(new Runnable() { // from class: ct
                @Override // java.lang.Runnable
                public final void run() {
                    qVar.invoke();
                }
            });
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements oh4<ox6, g2b> {
        public final /* synthetic */ qr5 u;
        public final /* synthetic */ ox6 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qr5 qr5Var, ox6 ox6Var) {
            super(1);
            this.u = qr5Var;
            this.v = ox6Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(ox6 ox6Var) {
            this.u.l(ox6Var.H(this.v));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements oh4<tx2, g2b> {
        public final /* synthetic */ qr5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(qr5 qr5Var) {
            super(1);
            this.u = qr5Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(tx2 tx2Var) {
            this.u.k0(tx2Var);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements oh4<mn7, g2b> {
        public final /* synthetic */ zgb u;
        public final /* synthetic */ qr5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(zgb zgbVar, qr5 qr5Var) {
            super(1);
            this.u = zgbVar;
            this.v = qr5Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(mn7 mn7Var) {
            mn7 mn7Var2 = mn7Var;
            cm cmVar = mn7Var2 instanceof cm ? (cm) mn7Var2 : null;
            zgb zgbVar = this.u;
            if (cmVar != null) {
                HashMap<bt, qr5> holderToLayoutNode = cmVar.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                qr5 qr5Var = this.v;
                holderToLayoutNode.put(zgbVar, qr5Var);
                cmVar.getAndroidViewsHandler$ui().addView(zgbVar);
                cmVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(qr5Var, zgbVar);
                zgbVar.setImportantForAccessibility(1);
                egb.o(zgbVar, new dm(cmVar, qr5Var, cmVar));
            }
            if (zgbVar.getView().getParent() != zgbVar) {
                zgbVar.addView(zgbVar.getView());
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends wp5 implements oh4<mn7, g2b> {
        public final /* synthetic */ zgb u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(zgb zgbVar) {
            super(1);
            this.u = zgbVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(mn7 mn7Var) {
            mn7 mn7Var2 = mn7Var;
            cm cmVar = mn7Var2 instanceof cm ? (cm) mn7Var2 : null;
            zgb zgbVar = this.u;
            if (cmVar != null) {
                cmVar.getAndroidViewsHandler$ui().removeViewInLayout(zgbVar);
                fza.a(cmVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(cmVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(zgbVar));
                zgbVar.setImportantForAccessibility(0);
            }
            zgbVar.removeAllViewsInLayout();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g implements fl6 {
        public final /* synthetic */ zgb a;
        public final /* synthetic */ qr5 b;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends wp5 implements oh4<jz7.a, g2b> {
            public static final a u = new a(1);

            @Override // defpackage.oh4
            public final /* bridge */ /* synthetic */ g2b invoke(jz7.a aVar) {
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b extends wp5 implements oh4<jz7.a, g2b> {
            public final /* synthetic */ zgb u;
            public final /* synthetic */ qr5 v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(zgb zgbVar, qr5 qr5Var) {
                super(1);
                this.u = zgbVar;
                this.v = qr5Var;
            }

            @Override // defpackage.oh4
            public final g2b invoke(jz7.a aVar) {
                dt.a(this.u, this.v);
                return g2b.a;
            }
        }

        public g(zgb zgbVar, qr5 qr5Var) {
            this.a = zgbVar;
            this.b = qr5Var;
        }

        @Override // defpackage.fl6
        public final int a(qj5 qj5Var, List<? extends pj5> list, int i) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            zgb zgbVar = this.a;
            ViewGroup.LayoutParams layoutParams = zgbVar.getLayoutParams();
            layoutParams.getClass();
            zgbVar.measure(iMakeMeasureSpec, bt.d(zgbVar, 0, i, layoutParams.height));
            return zgbVar.getMeasuredWidth();
        }

        @Override // defpackage.fl6
        public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
            zgb zgbVar = this.a;
            int childCount = zgbVar.getChildCount();
            if3 if3Var = if3.t;
            if (childCount == 0) {
                return hl6Var.y0(xx1.j(j), xx1.i(j), if3Var, a.u);
            }
            if (xx1.j(j) != 0) {
                zgbVar.getChildAt(0).setMinimumWidth(xx1.j(j));
            }
            if (xx1.i(j) != 0) {
                zgbVar.getChildAt(0).setMinimumHeight(xx1.i(j));
            }
            int iJ = xx1.j(j);
            int iH = xx1.h(j);
            ViewGroup.LayoutParams layoutParams = zgbVar.getLayoutParams();
            layoutParams.getClass();
            int iD = bt.d(zgbVar, iJ, iH, layoutParams.width);
            int i = xx1.i(j);
            int iG = xx1.g(j);
            ViewGroup.LayoutParams layoutParams2 = zgbVar.getLayoutParams();
            layoutParams2.getClass();
            zgbVar.measure(iD, bt.d(zgbVar, i, iG, layoutParams2.height));
            return hl6Var.y0(zgbVar.getMeasuredWidth(), zgbVar.getMeasuredHeight(), if3Var, new b(zgbVar, this.b));
        }

        @Override // defpackage.fl6
        public final int e(qj5 qj5Var, List<? extends pj5> list, int i) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            zgb zgbVar = this.a;
            ViewGroup.LayoutParams layoutParams = zgbVar.getLayoutParams();
            layoutParams.getClass();
            zgbVar.measure(iMakeMeasureSpec, bt.d(zgbVar, 0, i, layoutParams.height));
            return zgbVar.getMeasuredWidth();
        }

        @Override // defpackage.fl6
        public final int g(qj5 qj5Var, List<? extends pj5> list, int i) {
            zgb zgbVar = this.a;
            ViewGroup.LayoutParams layoutParams = zgbVar.getLayoutParams();
            layoutParams.getClass();
            zgbVar.measure(bt.d(zgbVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return zgbVar.getMeasuredHeight();
        }

        @Override // defpackage.fl6
        public final int i(qj5 qj5Var, List<? extends pj5> list, int i) {
            zgb zgbVar = this.a;
            ViewGroup.LayoutParams layoutParams = zgbVar.getLayoutParams();
            layoutParams.getClass();
            zgbVar.measure(bt.d(zgbVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return zgbVar.getMeasuredHeight();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h extends wp5 implements oh4<hc9, g2b> {
        public static final h u = new h(1);

        @Override // defpackage.oh4
        public final /* bridge */ /* synthetic */ g2b invoke(hc9 hc9Var) {
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i extends wp5 implements oh4<d73, g2b> {
        public final /* synthetic */ zgb u;
        public final /* synthetic */ qr5 v;
        public final /* synthetic */ zgb w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(zgb zgbVar, qr5 qr5Var, zgb zgbVar2) {
            super(1);
            this.u = zgbVar;
            this.v = qr5Var;
            this.w = zgbVar2;
        }

        @Override // defpackage.oh4
        public final g2b invoke(d73 d73Var) {
            n41 n41VarA = d73Var.Y0().a();
            zgb zgbVar = this.u;
            if (zgbVar.getView().getVisibility() != 8) {
                zgbVar.R = true;
                mn7 mn7Var = this.v.G;
                cm cmVar = mn7Var instanceof cm ? (cm) mn7Var : null;
                if (cmVar != null) {
                    Canvas canvasA = pl.a(n41VarA);
                    cmVar.getAndroidViewsHandler$ui().getClass();
                    this.w.draw(canvasA);
                }
                zgbVar.R = false;
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j extends wp5 implements oh4<qq5, g2b> {
        public final /* synthetic */ zgb u;
        public final /* synthetic */ qr5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(zgb zgbVar, qr5 qr5Var) {
            super(1);
            this.u = zgbVar;
            this.v = qr5Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(qq5 qq5Var) {
            WindowInsets windowInsetsG;
            qr5 qr5Var = this.v;
            zgb zgbVar = this.u;
            dt.a(zgbVar, qr5Var);
            zgbVar.v.I();
            int[] iArr = zgbVar.G;
            int i = iArr[0];
            int i2 = iArr[1];
            zgbVar.getView().getLocationOnScreen(iArr);
            long j = zgbVar.H;
            long jA = qq5Var.a();
            zgbVar.H = jA;
            umb umbVar = zgbVar.I;
            if (umbVar != null && ((i != iArr[0] || i2 != iArr[1] || !kg5.b(j, jA)) && (windowInsetsG = zgbVar.f(umbVar).g()) != null)) {
                zgbVar.getView().dispatchApplyWindowInsets(windowInsetsG);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k extends wp5 implements oh4<oh4<? super sk8, ? extends g2b>, g2b> {
        public final /* synthetic */ zgb u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(zgb zgbVar) {
            super(1);
            this.u = zgbVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.oh4
        public final g2b invoke(oh4<? super sk8, ? extends g2b> oh4Var) {
            this.u.J = oh4Var;
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {634, 636}, m = "invokeSuspend", v = 1)
    public static final class l extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ boolean u;
        public final /* synthetic */ bt v;
        public final /* synthetic */ long w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(boolean z, bt btVar, long j, r02<? super l> r02Var) {
            super(2, r02Var);
            this.u = z;
            this.v = btVar;
            this.w = j;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new l(this.u, this.v, this.w, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((l) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                c97 c97Var = this.v.t;
                v72 v72Var = v72.t;
                if (this.u) {
                    this.t = 2;
                    Object objA = c97Var.a(this.w, 0L, this);
                    if (objA != v72Var) {
                        obj = objA;
                        ((rdb) obj).getClass();
                    }
                } else {
                    this.t = 1;
                    Object objA2 = c97Var.a(0L, this.w, this);
                    if (objA2 != v72Var) {
                        obj = objA2;
                        ((rdb) obj).getClass();
                    }
                }
                return v72Var;
            }
            if (i == 1) {
                dv8.b(obj);
                ((rdb) obj).getClass();
            } else {
                if (i != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                ((rdb) obj).getClass();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {645}, m = "invokeSuspend", v = 1)
    public static final class m extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ long v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(long j, r02<? super m> r02Var) {
            super(2, r02Var);
            this.v = j;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return bt.this.new m(this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((m) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                c97 c97Var = bt.this.t;
                this.t = 1;
                Object objB = c97Var.b(this.v, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
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
    public static final class n extends wp5 implements mh4<g2b> {
        public static final n u = new n(0);

        @Override // defpackage.mh4
        public final /* bridge */ /* synthetic */ g2b invoke() {
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class o extends wp5 implements mh4<g2b> {
        public static final o u = new o(0);

        @Override // defpackage.mh4
        public final /* bridge */ /* synthetic */ g2b invoke() {
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class p extends wp5 implements mh4<g2b> {
        public final /* synthetic */ zgb u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(zgb zgbVar) {
            super(0);
            this.u = zgbVar;
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            this.u.getLayoutNode().O();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class q extends wp5 implements mh4<g2b> {
        public final /* synthetic */ zgb u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(zgb zgbVar) {
            super(0);
            this.u = zgbVar;
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            zgb zgbVar = this.u;
            if (zgbVar.x && zgbVar.isAttachedToWindow() && zgbVar.getView().getParent() == zgbVar) {
                un7 snapshotObserver = zgbVar.getSnapshotObserver();
                snapshotObserver.a.d(zgbVar, b.u, zgbVar.getUpdate());
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class r extends wp5 implements mh4<g2b> {
        public static final r u = new r(0);

        @Override // defpackage.mh4
        public final /* bridge */ /* synthetic */ g2b invoke() {
            return g2b.a;
        }
    }

    public bt(Context context, yt1 yt1Var, int i2, c97 c97Var, View view, mn7 mn7Var) {
        super(context);
        this.t = c97Var;
        this.u = view;
        this.v = mn7Var;
        if (yt1Var != null) {
            c37<Context, zz9<Float>> c37Var = dob.a;
            setTag(R.id.androidx_compose_ui_view_composition_context, yt1Var);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        zgb zgbVar = (zgb) this;
        egb.q(this, new a(zgbVar));
        egb.d.c(this, this);
        this.w = r.u;
        this.y = o.u;
        this.z = n.u;
        ox6.a aVar = ox6.a.t;
        this.A = aVar;
        this.C = yx2.a();
        this.G = new int[2];
        this.H = 0L;
        this.K = new q(zgbVar);
        this.L = new p(zgbVar);
        this.N = new int[2];
        this.O = Integer.MIN_VALUE;
        this.P = Integer.MIN_VALUE;
        this.Q = new p97();
        qr5 qr5Var = new qr5(3);
        qr5Var.H = zgbVar;
        ox6 ox6VarB = pb9.b(g97.a(aVar, dt.a, c97Var), true, h.u);
        j58 j58Var = new j58();
        j58Var.t = new k58(zgbVar);
        cq8 cq8Var = new cq8();
        cq8 cq8Var2 = j58Var.u;
        if (cq8Var2 != null) {
            cq8Var2.t = null;
        }
        j58Var.u = cq8Var;
        cq8Var.t = j58Var;
        setOnRequestDisallowInterceptTouchEvent$ui(cq8Var);
        ox6 ox6VarH = oh7.b(z63.c(ox6VarB.H(j58Var), new i(zgbVar, qr5Var, zgbVar)), new j(zgbVar, qr5Var)).H(new wv0(new k(zgbVar)));
        qr5Var.l(this.A.H(ox6VarH));
        this.B = new c(qr5Var, ox6VarH);
        qr5Var.k0(this.C);
        this.D = new d(qr5Var);
        qr5Var.f0 = new e(zgbVar, qr5Var);
        qr5Var.g0 = new f(zgbVar);
        qr5Var.c(new g(zgbVar, qr5Var));
        this.S = qr5Var;
    }

    public static final int d(zgb zgbVar, int i2, int i3, int i4) {
        if (i4 >= 0 || i2 == i3) {
            return View.MeasureSpec.makeMeasureSpec(uh8.g(i4, i2, i3), 1073741824);
        }
        if (i4 != -2 || i3 == Integer.MAX_VALUE) {
            return (i4 != -1 || i3 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static xd5 e(xd5 xd5Var, int i2, int i3, int i4, int i5) {
        int i6 = xd5Var.a - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = xd5Var.b - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = xd5Var.c - i4;
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = xd5Var.d - i5;
        return xd5.c(i6, i7, i8, i9 >= 0 ? i9 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final un7 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            uc5.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.v.getSnapshotObserver();
    }

    @Override // defpackage.nn7
    public final boolean V() {
        return isAttachedToWindow();
    }

    @Override // defpackage.ls1
    public final void a() {
        this.z.invoke();
    }

    @Override // defpackage.pg7
    public final umb b(View view, umb umbVar) {
        this.I = new umb(umbVar);
        return f(umbVar);
    }

    public final umb f(umb umbVar) {
        umb.q qVar = umbVar.a;
        xd5 xd5VarI = qVar.i(-1);
        xd5 xd5Var = xd5.e;
        if (!xd5VarI.equals(xd5Var) || !qVar.j(-9).equals(xd5Var) || qVar.h() != null) {
            fd5 fd5Var = this.S.Y.c;
            if (fd5Var.n0.G) {
                long jC = cg5.c(fd5Var.a0(0L));
                int i2 = (int) (jC >> 32);
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (int) (jC & 4294967295L);
                if (i3 < 0) {
                    i3 = 0;
                }
                long jA = rq5.d(fd5Var).a();
                int i4 = (int) (jA >> 32);
                int i5 = (int) (jA & 4294967295L);
                long j2 = fd5Var.v;
                long jC2 = cg5.c(fd5Var.a0((((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L)));
                int i6 = i4 - ((int) (jC2 >> 32));
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = i5 - ((int) (4294967295L & jC2));
                int i8 = i7 >= 0 ? i7 : 0;
                if (i2 != 0 || i3 != 0 || i6 != 0 || i8 != 0) {
                    return umbVar.a.r(i2, i3, i6, i8);
                }
            }
        }
        return umbVar;
    }

    @Override // defpackage.ls1
    public final void g() {
        this.y.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.N;
        getLocationInWindow(iArr);
        int i2 = iArr[0];
        region.op(i2, iArr[1], getWidth() + i2, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final tx2 getDensity() {
        return this.C;
    }

    public final View getInteropView() {
        return this.u;
    }

    public final qr5 getLayoutNode() {
        return this.S;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.u.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final m76 getLifecycleOwner() {
        return this.E;
    }

    public final ox6 getModifier() {
        return this.A;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        p97 p97Var = this.Q;
        return p97Var.b | p97Var.a;
    }

    public final oh4<tx2, g2b> getOnDensityChanged$ui() {
        return this.D;
    }

    public final oh4<ox6, g2b> getOnModifierChanged$ui() {
        return this.B;
    }

    public final oh4<Boolean, g2b> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.M;
    }

    public final mh4<g2b> getRelease() {
        return this.z;
    }

    public final mh4<g2b> getReset() {
        return this.y;
    }

    public final f19 getSavedStateRegistryOwner() {
        return this.F;
    }

    public final mh4<g2b> getUpdate() {
        return this.w;
    }

    public final View getView() {
        return this.u;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @gy2
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.R) {
            this.S.O();
            return null;
        }
        this.u.postOnAnimation(new at(0, this.L));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.u.isNestedScrollingEnabled();
    }

    @Override // defpackage.n97
    public final void j(int i2, View view) {
        p97 p97Var = this.Q;
        if (i2 == 1) {
            p97Var.b = 0;
        } else {
            p97Var.a = 0;
        }
    }

    @Override // defpackage.o97
    public final void k(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (this.u.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i3 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i4 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i5 * (-1.0f))) & 4294967295L);
            int i7 = i6 == 0 ? 1 : 2;
            h97 h97Var = this.t.a;
            h97 h97VarD2 = h97Var != null ? h97Var.d2() : null;
            long jF0 = h97VarD2 != null ? h97VarD2.f0(jFloatToRawIntBits, i7, jFloatToRawIntBits2) : 0L;
            iArr[0] = wk6.b(Float.intBitsToFloat((int) (jF0 >> 32))) * (-1);
            iArr[1] = wk6.b(Float.intBitsToFloat((int) (jF0 & 4294967295L))) * (-1);
        }
    }

    @Override // defpackage.n97
    public final void l(View view, int i2, int i3, int i4, int i5, int i6) {
        if (this.u.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i3 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i4 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i5 * (-1.0f))) & 4294967295L);
            int i7 = i6 == 0 ? 1 : 2;
            h97 h97Var = this.t.a;
            h97 h97VarD2 = h97Var != null ? h97Var.d2() : null;
            if (h97VarD2 != null) {
                h97VarD2.f0(jFloatToRawIntBits, i7, jFloatToRawIntBits2);
            }
        }
    }

    @Override // defpackage.n97
    public final boolean m(View view, View view2, int i2, int i3) {
        return ((i2 & 2) == 0 && (i2 & 1) == 0) ? false : true;
    }

    @Override // defpackage.n97
    public final void n(View view, View view2, int i2, int i3) {
        p97 p97Var = this.Q;
        if (i3 == 1) {
            p97Var.b = i2;
        } else {
            p97Var.a = i2;
        }
    }

    @Override // defpackage.n97
    public final void o(View view, int i2, int i3, int[] iArr, int i4) {
        if (this.u.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i3 * (-1.0f))) & 4294967295L);
            int i5 = i4 == 0 ? 1 : 2;
            h97 h97Var = this.t.a;
            h97 h97VarD2 = h97Var != null ? h97Var.d2() : null;
            long jB0 = h97VarD2 != null ? h97VarD2.B0(i5, jFloatToRawIntBits) : 0L;
            iArr[0] = wk6.b(Float.intBitsToFloat((int) (jB0 >> 32))) * (-1);
            iArr[1] = wk6.b(Float.intBitsToFloat((int) (jB0 & 4294967295L))) * (-1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.R) {
            this.S.O();
        } else {
            this.u.postOnAnimation(new at(0, this.L));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.u.layout(0, 0, i4 - i2, i5 - i3);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        View view = this.u;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.O = i2;
        this.P = i3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.u.isNestedScrollingEnabled()) {
            return false;
        }
        oy0.d(this.t.c(), null, null, new l(z, this, sdb.a(f2 * (-1.0f), f3 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        if (!this.u.isNestedScrollingEnabled()) {
            return false;
        }
        oy0.d(this.t.c(), null, null, new m(sdb.a(f2 * (-1.0f), f3 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    @Override // defpackage.ls1
    public final void p() {
        View view = this.u;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.y.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        oh4<? super sk8, g2b> oh4Var = this.J;
        if (oh4Var == null) {
            return true;
        }
        oh4Var.invoke(rect != null ? new sk8(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        oh4<? super Boolean, g2b> oh4Var = this.M;
        if (oh4Var != null) {
            oh4Var.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(tx2 tx2Var) {
        if (tx2Var != this.C) {
            this.C = tx2Var;
            oh4<? super tx2, g2b> oh4Var = this.D;
            if (oh4Var != null) {
                oh4Var.invoke(tx2Var);
            }
        }
    }

    public final void setLifecycleOwner(m76 m76Var) {
        if (m76Var != this.E) {
            this.E = m76Var;
            setTag(R.id.view_tree_lifecycle_owner, m76Var);
        }
    }

    public final void setModifier(ox6 ox6Var) {
        if (ox6Var != this.A) {
            this.A = ox6Var;
            oh4<? super ox6, g2b> oh4Var = this.B;
            if (oh4Var != null) {
                oh4Var.invoke(ox6Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(oh4<? super tx2, g2b> oh4Var) {
        this.D = oh4Var;
    }

    public final void setOnModifierChanged$ui(oh4<? super ox6, g2b> oh4Var) {
        this.B = oh4Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(oh4<? super Boolean, g2b> oh4Var) {
        this.M = oh4Var;
    }

    public final void setRelease(mh4<g2b> mh4Var) {
        this.z = mh4Var;
    }

    public final void setReset(mh4<g2b> mh4Var) {
        this.y = mh4Var;
    }

    public final void setSavedStateRegistryOwner(f19 f19Var) {
        if (f19Var != this.F) {
            this.F = f19Var;
            setTag(R.id.view_tree_saved_state_registry_owner, f19Var);
        }
    }

    public final void setUpdate(mh4<g2b> mh4Var) {
        this.w = mh4Var;
        this.x = true;
        this.K.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
