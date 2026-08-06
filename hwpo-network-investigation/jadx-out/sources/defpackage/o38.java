package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.ui.b;
import androidx.media3.ui.c;
import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o38 {
    public boolean B;
    public boolean C;
    public final androidx.media3.ui.c a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final ViewGroup j;
    public final View k;
    public final View l;
    public final AnimatorSet m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final AnimatorSet p;
    public final AnimatorSet q;
    public final ValueAnimator r;
    public final ValueAnimator s;
    public final xl t = new xl(1, this);
    public final p04 u = new p04(1, this);
    public final q04 v = new q04(1, this);
    public final r04 w = new r04(1, this);
    public final hm x = new hm(1, this);
    public final l38 y = new View.OnLayoutChangeListener() { // from class: l38
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            int paddingRight;
            int height;
            int paddingBottom;
            int height2;
            final o38 o38Var = this.a;
            c cVar = o38Var.a;
            int width = (cVar.getWidth() - cVar.getPaddingLeft()) - cVar.getPaddingRight();
            int height3 = (cVar.getHeight() - cVar.getPaddingBottom()) - cVar.getPaddingTop();
            ViewGroup viewGroup = o38Var.d;
            int iC = o38.c(viewGroup);
            if (viewGroup != null) {
                paddingRight = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
            } else {
                paddingRight = 0;
            }
            int i10 = iC - paddingRight;
            if (viewGroup == null) {
                height = 0;
            } else {
                height = viewGroup.getHeight();
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                }
            }
            if (viewGroup != null) {
                paddingBottom = viewGroup.getPaddingBottom() + viewGroup.getPaddingTop();
            } else {
                paddingBottom = 0;
            }
            int i11 = height - paddingBottom;
            int iMax = Math.max(i10, o38.c(o38Var.l) + o38.c(o38Var.j));
            ViewGroup viewGroup2 = o38Var.e;
            if (viewGroup2 == null) {
                height2 = 0;
            } else {
                height2 = viewGroup2.getHeight();
                ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                }
            }
            int i12 = 1;
            boolean z = width <= iMax || height3 <= (height2 * 2) + i11;
            if (o38Var.B != z) {
                o38Var.B = z;
                view.post(new Runnable() { // from class: i38
                    @Override // java.lang.Runnable
                    public final void run() {
                        o38 o38Var2 = o38Var;
                        View view2 = o38Var2.k;
                        ViewGroup viewGroup3 = o38Var2.f;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(o38Var2.B ? 0 : 4);
                        }
                        if (view2 != null) {
                            int dimensionPixelSize = o38Var2.a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                            if (marginLayoutParams3 != null) {
                                if (o38Var2.B) {
                                    dimensionPixelSize = 0;
                                }
                                marginLayoutParams3.bottomMargin = dimensionPixelSize;
                                view2.setLayoutParams(marginLayoutParams3);
                            }
                            if (view2 instanceof b) {
                                b bVar = (b) view2;
                                Rect rect = bVar.t;
                                ValueAnimator valueAnimator = bVar.a0;
                                if (o38Var2.B) {
                                    if (valueAnimator.isStarted()) {
                                        valueAnimator.cancel();
                                    }
                                    bVar.c0 = true;
                                    bVar.b0 = 0.0f;
                                    bVar.invalidate(rect);
                                } else {
                                    int i13 = o38Var2.A;
                                    if (i13 == 1) {
                                        if (valueAnimator.isStarted()) {
                                            valueAnimator.cancel();
                                        }
                                        bVar.c0 = false;
                                        bVar.b0 = 0.0f;
                                        bVar.invalidate(rect);
                                    } else if (i13 != 3) {
                                        if (valueAnimator.isStarted()) {
                                            valueAnimator.cancel();
                                        }
                                        bVar.c0 = false;
                                        bVar.b0 = 1.0f;
                                        bVar.invalidate(rect);
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = o38Var2.z;
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            View view3 = (View) obj;
                            view3.setVisibility((o38Var2.B && o38.j(view3)) ? 4 : 0);
                        }
                    }
                });
            }
            boolean z2 = i4 - i2 != i8 - i6;
            if (o38Var.B || !z2) {
                return;
            }
            view.post(new am(i12, o38Var));
        }
    };
    public boolean D = true;
    public int A = 0;
    public final ArrayList z = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o38 o38Var = o38.this;
            View view = o38Var.b;
            if (view != null) {
                view.setVisibility(4);
            }
            ViewGroup viewGroup = o38Var.c;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            ViewGroup viewGroup2 = o38Var.d;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
            }
            ViewGroup viewGroup3 = o38Var.f;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o38 o38Var = o38.this;
            View view = o38Var.k;
            if (!(view instanceof androidx.media3.ui.b) || o38Var.B) {
                return;
            }
            androidx.media3.ui.b bVar = (androidx.media3.ui.b) view;
            ValueAnimator valueAnimator = bVar.a0;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            valueAnimator.setFloatValues(bVar.b0, 0.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o38 o38Var = o38.this;
            View view = o38Var.b;
            if (view != null) {
                view.setVisibility(0);
            }
            ViewGroup viewGroup = o38Var.c;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = o38Var.d;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            ViewGroup viewGroup3 = o38Var.f;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(o38Var.B ? 0 : 4);
            }
            View view2 = o38Var.k;
            if (!(view2 instanceof androidx.media3.ui.b) || o38Var.B) {
                return;
            }
            androidx.media3.ui.b bVar = (androidx.media3.ui.b) view2;
            ValueAnimator valueAnimator = bVar.a0;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            bVar.c0 = false;
            valueAnimator.setFloatValues(bVar.b0, 1.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ androidx.media3.ui.c a;

        public c(androidx.media3.ui.c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o38 o38Var = o38.this;
            o38Var.i(1);
            if (o38Var.C) {
                this.a.post(o38Var.t);
                o38Var.C = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o38.this.i(3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ androidx.media3.ui.c a;

        public d(androidx.media3.ui.c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o38 o38Var = o38.this;
            o38Var.i(2);
            if (o38Var.C) {
                this.a.post(o38Var.t);
                o38Var.C = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o38.this.i(3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e extends AnimatorListenerAdapter {
        public final /* synthetic */ androidx.media3.ui.c a;

        public e(androidx.media3.ui.c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o38 o38Var = o38.this;
            o38Var.i(2);
            if (o38Var.C) {
                this.a.post(o38Var.t);
                o38Var.C = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o38.this.i(3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o38.this.i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o38.this.i(4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o38.this.i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o38.this.i(4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = o38.this.g;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = o38.this.i;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                viewGroup.setTranslationX(viewGroup.getWidth());
                viewGroup.scrollTo(viewGroup.getWidth(), 0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = o38.this.i;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = o38.this.g;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l38] */
    public o38(androidx.media3.ui.c cVar) {
        this.a = cVar;
        this.c = (ViewGroup) cVar.findViewById(R.id.exo_top_controls);
        this.b = cVar.findViewById(R.id.exo_controls_background);
        this.d = (ViewGroup) cVar.findViewById(R.id.exo_center_controls);
        this.f = (ViewGroup) cVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) cVar.findViewById(R.id.exo_bottom_bar);
        this.e = viewGroup;
        this.j = (ViewGroup) cVar.findViewById(R.id.exo_time);
        View viewFindViewById = cVar.findViewById(R.id.exo_progress);
        this.k = viewFindViewById;
        this.g = (ViewGroup) cVar.findViewById(R.id.exo_basic_controls);
        this.h = (ViewGroup) cVar.findViewById(R.id.exo_extra_controls);
        this.i = (ViewGroup) cVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = cVar.findViewById(R.id.exo_overflow_show);
        this.l = viewFindViewById2;
        View viewFindViewById3 = cVar.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: m38
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o38 o38Var = this.t;
                    o38Var.g();
                    if (view.getId() == R.id.exo_overflow_show) {
                        o38Var.r.start();
                    } else if (view.getId() == R.id.exo_overflow_hide) {
                        o38Var.s.start();
                    }
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: m38
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o38 o38Var = this.t;
                    o38Var.g();
                    if (view.getId() == R.id.exo_overflow_show) {
                        o38Var.r.start();
                    } else if (view.getId() == R.id.exo_overflow_hide) {
                        o38Var.s.start();
                    }
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: n38
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o38 o38Var = this.a;
                View view = o38Var.b;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = o38Var.c;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup3 = o38Var.d;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup4 = o38Var.f;
                if (viewGroup4 != null) {
                    viewGroup4.setAlpha(fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: h38
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o38 o38Var = this.a;
                View view = o38Var.b;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = o38Var.c;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup3 = o38Var.d;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup4 = o38Var.f;
                if (viewGroup4 != null) {
                    viewGroup4.setAlpha(fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = cVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(cVar));
        animatorSet.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension)).with(d(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(cVar));
        animatorSet2.play(d(viewFindViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.o = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(cVar));
        animatorSet3.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension2)).with(d(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.p = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension, 0.0f)).with(d(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.q = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension2, 0.0f)).with(d(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.r = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: j38
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.s = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: k38
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator d(View view, float f2, float f3) {
        return ObjectAnimator.ofFloat(view, "translationY", f2, f3);
    }

    public static boolean j(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_media_route_button_placeholder || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    public final void a(float f2) {
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f2) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.j;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f2);
        }
        ViewGroup viewGroup3 = this.g;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f2);
        }
    }

    public final boolean b(View view) {
        return view != null && this.z.contains(view);
    }

    public final void e(Runnable runnable, long j) {
        if (j >= 0) {
            this.a.postDelayed(runnable, j);
        }
    }

    public final void f() {
        hm hmVar = this.x;
        androidx.media3.ui.c cVar = this.a;
        cVar.removeCallbacks(hmVar);
        cVar.removeCallbacks(this.u);
        cVar.removeCallbacks(this.w);
        cVar.removeCallbacks(this.v);
    }

    public final void g() {
        if (this.A == 3) {
            return;
        }
        f();
        int showTimeoutMs = this.a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.D) {
                e(this.x, showTimeoutMs);
            } else if (this.A == 1) {
                e(this.v, 2000L);
            } else {
                e(this.w, showTimeoutMs);
            }
        }
    }

    public final void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.z;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.B && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i2) {
        int i3 = this.A;
        this.A = i2;
        androidx.media3.ui.c cVar = this.a;
        if (i2 == 2) {
            cVar.setVisibility(8);
        } else if (i3 == 2) {
            cVar.setVisibility(0);
        }
        if (i3 != i2) {
            Iterator<androidx.media3.ui.c.m> it = cVar.D.iterator();
            while (it.hasNext()) {
                it.next().p(cVar.getVisibility());
            }
        }
    }

    public final void k() {
        if (!this.D) {
            i(0);
            g();
            return;
        }
        int i2 = this.A;
        if (i2 == 1) {
            this.p.start();
        } else if (i2 == 2) {
            this.q.start();
        } else if (i2 == 3) {
            this.C = true;
        } else if (i2 == 4) {
            return;
        }
        g();
    }
}
