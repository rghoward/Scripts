package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.c;
import androidx.fragment.app.f;
import androidx.fragment.app.l;
import androidx.fragment.app.u;
import com.hwpo_training_app.R;
import defpackage.aa0;
import defpackage.ahb;
import defpackage.egb;
import defpackage.ek7;
import defpackage.fib;
import defpackage.g2b;
import defpackage.gh0;
import defpackage.gl8;
import defpackage.j41;
import defpackage.js7;
import defpackage.kg4;
import defpackage.lg4;
import defpackage.mh4;
import defpackage.n30;
import defpackage.ng4;
import defpackage.og4;
import defpackage.ph1;
import defpackage.pp2;
import defpackage.pt2;
import defpackage.qt2;
import defpackage.rh1;
import defpackage.th1;
import defpackage.wp5;
import defpackage.yl9;
import defpackage.z90;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends u {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends u.a {
        public final b c;

        /* JADX INFO: renamed from: androidx.fragment.app.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class AnimationAnimationListenerC0016a implements Animation.AnimationListener {
            public final /* synthetic */ u.c a;
            public final /* synthetic */ ViewGroup b;
            public final /* synthetic */ View c;
            public final /* synthetic */ a d;

            public AnimationAnimationListenerC0016a(u.c cVar, ViewGroup viewGroup, View view, a aVar) {
                this.a = cVar;
                this.b = viewGroup;
                this.c = view;
                this.d = aVar;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                animation.getClass();
                ViewGroup viewGroup = this.b;
                viewGroup.post(new qt2(viewGroup, this.c, this.d, 0));
                if (l.M(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
                animation.getClass();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                animation.getClass();
                if (l.M(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b bVar) {
            this.c = bVar;
        }

        @Override // androidx.fragment.app.u.a
        public final void b(ViewGroup viewGroup) {
            viewGroup.getClass();
            b bVar = this.c;
            u.c cVar = bVar.a;
            View view = cVar.c.mView;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            bVar.a.c(this);
            if (l.M(2)) {
                Log.v("FragmentManager", "Animation from operation " + cVar + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.u.a
        public final void c(ViewGroup viewGroup) {
            viewGroup.getClass();
            b bVar = this.c;
            boolean zA = bVar.a();
            u.c cVar = bVar.a;
            if (zA) {
                cVar.c(this);
                return;
            }
            Context context = viewGroup.getContext();
            View view = cVar.c.mView;
            context.getClass();
            androidx.fragment.app.h.a aVarB = bVar.b(context);
            if (aVarB == null) {
                aa0.c("Required value was null.");
                return;
            }
            Animation animation = aVarB.a;
            if (animation == null) {
                aa0.c("Required value was null.");
                return;
            }
            if (cVar.a != u.c.b.t) {
                view.startAnimation(animation);
                cVar.c(this);
                return;
            }
            viewGroup.startViewTransition(view);
            androidx.fragment.app.h.b bVar2 = new androidx.fragment.app.h.b(animation, viewGroup, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0016a(cVar, viewGroup, view, this));
            view.startAnimation(bVar2);
            if (l.M(2)) {
                Log.v("FragmentManager", "Animation from operation " + cVar + " has started.");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends f {
        public final boolean b;
        public boolean c;
        public androidx.fragment.app.h.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u.c cVar, boolean z) {
            super(cVar);
            cVar.getClass();
            this.b = z;
        }

        /* JADX WARN: Code duplicated, block: B:74:0x00f5 A[Catch: RuntimeException -> 0x00fb, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00fb, blocks: (B:72:0x00ef, B:74:0x00f5), top: B:85:0x00ef }] */
        public final androidx.fragment.app.h.a b(Context context) {
            int enterAnim;
            androidx.fragment.app.h.a aVar;
            Animator animatorLoadAnimator;
            int iA;
            if (this.c) {
                return this.d;
            }
            u.c cVar = this.a;
            androidx.fragment.app.f fVar = cVar.c;
            boolean z = cVar.a == u.c.b.u;
            int nextTransition = fVar.getNextTransition();
            if (this.b) {
                enterAnim = z ? fVar.getPopEnterAnim() : fVar.getPopExitAnim();
            } else {
                enterAnim = z ? fVar.getEnterAnim() : fVar.getExitAnim();
            }
            fVar.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fVar.mContainer;
            androidx.fragment.app.h.a aVar2 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fVar.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fVar.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation animationOnCreateAnimation = fVar.onCreateAnimation(nextTransition, z, enterAnim);
                if (animationOnCreateAnimation != null) {
                    aVar2 = new androidx.fragment.app.h.a(animationOnCreateAnimation);
                } else {
                    Animator animatorOnCreateAnimator = fVar.onCreateAnimator(nextTransition, z, enterAnim);
                    if (animatorOnCreateAnimator != null) {
                        aVar2 = new androidx.fragment.app.h.a(animatorOnCreateAnimator);
                    } else {
                        if (enterAnim == 0 && nextTransition != 0) {
                            if (nextTransition == 4097) {
                                iA = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                            } else if (nextTransition == 8194) {
                                iA = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                            } else if (nextTransition == 8197) {
                                iA = z ? androidx.fragment.app.h.a(context, android.R.attr.activityCloseEnterAnimation) : androidx.fragment.app.h.a(context, android.R.attr.activityCloseExitAnimation);
                            } else if (nextTransition == 4099) {
                                iA = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                            } else if (nextTransition != 4100) {
                                iA = -1;
                            } else {
                                iA = z ? androidx.fragment.app.h.a(context, android.R.attr.activityOpenEnterAnimation) : androidx.fragment.app.h.a(context, android.R.attr.activityOpenExitAnimation);
                            }
                            enterAnim = iA;
                        }
                        if (enterAnim != 0) {
                            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                            if (zEquals) {
                                try {
                                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation != null) {
                                        aVar = new androidx.fragment.app.h.a(animationLoadAnimation);
                                        aVar2 = aVar;
                                    }
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException unused) {
                                    try {
                                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                        if (animatorLoadAnimator != null) {
                                            aVar = new androidx.fragment.app.h.a(animatorLoadAnimator);
                                            aVar2 = aVar;
                                        }
                                    } catch (RuntimeException e2) {
                                        if (zEquals) {
                                            throw e2;
                                        }
                                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                        if (animationLoadAnimation2 != null) {
                                            aVar2 = new androidx.fragment.app.h.a(animationLoadAnimation2);
                                        }
                                    }
                                }
                            } else {
                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                if (animatorLoadAnimator != null) {
                                    aVar = new androidx.fragment.app.h.a(animatorLoadAnimator);
                                    aVar2 = aVar;
                                }
                            }
                        }
                    }
                }
            }
            this.d = aVar2;
            this.c = true;
            return aVar2;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class C0017c extends u.a {
        public final b c;
        public AnimatorSet d;

        /* JADX INFO: renamed from: androidx.fragment.app.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends AnimatorListenerAdapter {
            public final /* synthetic */ ViewGroup a;
            public final /* synthetic */ View b;
            public final /* synthetic */ boolean c;
            public final /* synthetic */ u.c d;
            public final /* synthetic */ C0017c e;

            public a(ViewGroup viewGroup, View view, boolean z, u.c cVar, C0017c c0017c) {
                this.a = viewGroup;
                this.b = view;
                this.c = z;
                this.d = cVar;
                this.e = c0017c;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animator.getClass();
                ViewGroup viewGroup = this.a;
                View view = this.b;
                viewGroup.endViewTransition(view);
                boolean z = this.c;
                u.c cVar = this.d;
                if (z || cVar.a == u.c.b.v) {
                    u.c.b bVar = cVar.a;
                    view.getClass();
                    bVar.a(view, viewGroup);
                }
                C0017c c0017c = this.e;
                c0017c.c.a.c(c0017c);
                if (l.M(2)) {
                    Log.v("FragmentManager", "Animator from operation " + cVar + " has ended.");
                }
            }
        }

        public C0017c(b bVar) {
            this.c = bVar;
        }

        @Override // androidx.fragment.app.u.a
        public final void b(ViewGroup viewGroup) {
            viewGroup.getClass();
            AnimatorSet animatorSet = this.d;
            b bVar = this.c;
            if (animatorSet == null) {
                bVar.a.c(this);
                return;
            }
            u.c cVar = bVar.a;
            if (!cVar.g) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                e.a.a(animatorSet);
            }
            if (l.M(2)) {
                StringBuilder sb = new StringBuilder("Animator from operation ");
                sb.append(cVar);
                sb.append(" has been canceled");
                sb.append(cVar.g ? " with seeking." : ".");
                sb.append(' ');
                Log.v("FragmentManager", sb.toString());
            }
        }

        @Override // androidx.fragment.app.u.a
        public final void c(ViewGroup viewGroup) {
            viewGroup.getClass();
            u.c cVar = this.c.a;
            AnimatorSet animatorSet = this.d;
            if (animatorSet == null) {
                cVar.c(this);
                return;
            }
            animatorSet.start();
            if (l.M(2)) {
                Log.v("FragmentManager", "Animator from operation " + cVar + " has started.");
            }
        }

        @Override // androidx.fragment.app.u.a
        public final void d(gh0 gh0Var, ViewGroup viewGroup) {
            viewGroup.getClass();
            u.c cVar = this.c.a;
            AnimatorSet animatorSet = this.d;
            if (animatorSet == null) {
                cVar.c(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !cVar.c.mTransitioning) {
                return;
            }
            if (l.M(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + cVar);
            }
            long jA = d.a.a(animatorSet);
            long j = (long) (gh0Var.c * jA);
            if (j == 0) {
                j = 1;
            }
            if (j == jA) {
                j = jA - 1;
            }
            if (l.M(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + cVar);
            }
            e.a.b(animatorSet, j);
        }

        @Override // androidx.fragment.app.u.a
        public final void e(ViewGroup viewGroup) {
            C0017c c0017c;
            viewGroup.getClass();
            b bVar = this.c;
            if (bVar.a()) {
                return;
            }
            Context context = viewGroup.getContext();
            context.getClass();
            androidx.fragment.app.h.a aVarB = bVar.b(context);
            this.d = aVarB != null ? aVarB.b : null;
            u.c cVar = bVar.a;
            androidx.fragment.app.f fVar = cVar.c;
            boolean z = cVar.a == u.c.b.v;
            View view = fVar.mView;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                c0017c = this;
                animatorSet.addListener(new a(viewGroup, view, z, cVar, c0017c));
            } else {
                c0017c = this;
            }
            AnimatorSet animatorSet2 = c0017c.d;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public static final d a = new d();

        public final long a(AnimatorSet animatorSet) {
            animatorSet.getClass();
            return animatorSet.getTotalDuration();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        public static final e a = new e();

        public final void a(AnimatorSet animatorSet) {
            animatorSet.getClass();
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j) {
            animatorSet.getClass();
            animatorSet.setCurrentPlayTime(j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class f {
        public final u.c a;

        public f(u.c cVar) {
            cVar.getClass();
            this.a = cVar;
        }

        public final boolean a() {
            u.c.b bVar;
            u.c cVar = this.a;
            View view = cVar.c.mView;
            u.c.b bVar2 = u.c.b.u;
            if (view != null) {
                float alpha = view.getAlpha();
                bVar = u.c.b.w;
                if (alpha != 0.0f || view.getVisibility() != 0) {
                    int visibility = view.getVisibility();
                    if (visibility == 0) {
                        bVar = bVar2;
                    } else if (visibility != 4) {
                        if (visibility != 8) {
                            z90.a(pp2.a(visibility, "Unknown visibility "));
                            return false;
                        }
                        bVar = u.c.b.v;
                    }
                }
            } else {
                bVar = null;
            }
            u.c.b bVar3 = cVar.a;
            if (bVar != bVar3) {
                return (bVar == bVar2 || bVar3 == bVar2) ? false : true;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends u.a {
        public final ArrayList c;
        public final u.c d;
        public final u.c e;
        public final og4 f;
        public final Object g;
        public final ArrayList<View> h;
        public final ArrayList<View> i;
        public final n30<String, String> j;
        public final ArrayList<String> k;
        public final ArrayList<String> l;
        public final n30<String, View> m;
        public final n30<String, View> n;
        public final boolean o;
        public final j41 p = new j41();
        public Object q;
        public boolean r;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends wp5 implements mh4<g2b> {
            public final /* synthetic */ g u;
            public final /* synthetic */ ViewGroup v;
            public final /* synthetic */ Object w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, g gVar, Object obj) {
                super(0);
                this.u = gVar;
                this.v = viewGroup;
                this.w = obj;
            }

            @Override // defpackage.mh4
            public final g2b invoke() {
                this.u.f.e(this.v, this.w);
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b extends wp5 implements mh4<g2b> {
            public final /* synthetic */ ViewGroup v;
            public final /* synthetic */ Object w;
            public final /* synthetic */ gl8<mh4<g2b>> x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ViewGroup viewGroup, Object obj, gl8<mh4<g2b>> gl8Var) {
                super(0);
                this.v = viewGroup;
                this.w = obj;
                this.x = gl8Var;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.fragment.app.d] */
            @Override // defpackage.mh4
            public final g2b invoke() {
                if (l.M(2)) {
                    Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                }
                g gVar = g.this;
                og4 og4Var = gVar.f;
                ViewGroup viewGroup = this.v;
                Object obj = this.w;
                Object objI = og4Var.i(viewGroup, obj);
                gVar.q = objI;
                if (objI == null) {
                    if (l.M(2)) {
                        Log.v("FragmentManager", "TransitionSeekController was not created.");
                    }
                    gVar.r = true;
                } else {
                    this.x.t = new androidx.fragment.app.d(viewGroup, gVar, obj);
                    if (l.M(2)) {
                        Log.v("FragmentManager", "Started executing operations from " + gVar.d + " to " + gVar.e);
                    }
                }
                return g2b.a;
            }
        }

        public g(ArrayList arrayList, u.c cVar, u.c cVar2, og4 og4Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, n30 n30Var, ArrayList arrayList4, ArrayList arrayList5, n30 n30Var2, n30 n30Var3, boolean z) {
            this.c = arrayList;
            this.d = cVar;
            this.e = cVar2;
            this.f = og4Var;
            this.g = obj;
            this.h = arrayList2;
            this.i = arrayList3;
            this.j = n30Var;
            this.k = arrayList4;
            this.l = arrayList5;
            this.m = n30Var2;
            this.n = n30Var3;
            this.o = z;
        }

        public static void f(View view, ArrayList arrayList) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int i = ahb.a;
            if (viewGroup.isTransitionGroup()) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    f(childAt, arrayList);
                }
            }
        }

        @Override // androidx.fragment.app.u.a
        public final boolean a() {
            Object obj;
            Object obj2;
            og4 og4Var = this.f;
            if (og4Var.l()) {
                ArrayList arrayList = this.c;
                if (arrayList != null && arrayList.isEmpty()) {
                    obj2 = this.g;
                    return obj2 != null ? true : true;
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    h hVar = (h) obj3;
                    if (Build.VERSION.SDK_INT < 34 || (obj = hVar.b) == null || !og4Var.m(obj)) {
                    }
                }
                obj2 = this.g;
                if (obj2 != null || og4Var.m(obj2)) {
                }
            }
            return false;
        }

        @Override // androidx.fragment.app.u.a
        public final void b(ViewGroup viewGroup) {
            viewGroup.getClass();
            this.p.a();
        }

        @Override // androidx.fragment.app.u.a
        public final void c(ViewGroup viewGroup) {
            viewGroup.getClass();
            boolean zIsLaidOut = viewGroup.isLaidOut();
            int i = 0;
            ArrayList arrayList = this.c;
            if (!zIsLaidOut || this.r) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    h hVar = (h) obj;
                    u.c cVar = hVar.a;
                    if (l.M(2)) {
                        if (this.r) {
                            Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + cVar);
                        } else {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + cVar);
                        }
                    }
                    hVar.a.c(this);
                }
                this.r = false;
                return;
            }
            Object obj2 = this.q;
            og4 og4Var = this.f;
            u.c cVar2 = this.e;
            u.c cVar3 = this.d;
            if (obj2 != null) {
                og4Var.c(obj2);
                if (l.M(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + cVar3 + " to " + cVar2);
                    return;
                }
                return;
            }
            js7<ArrayList<View>, Object> js7VarG = g(viewGroup, cVar2, cVar3);
            ArrayList<View> arrayList2 = js7VarG.t;
            Object obj3 = js7VarG.u;
            ArrayList arrayList3 = new ArrayList(ph1.n(arrayList, 10));
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj4 = arrayList.get(i3);
                i3++;
                arrayList3.add(((h) obj4).a);
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj5 = arrayList3.get(i);
                i++;
                final u.c cVar4 = (u.c) obj5;
                og4Var.u(cVar4.c, obj3, this.p, new Runnable() { // from class: tt2
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zM = l.M(2);
                        u.c cVar5 = cVar4;
                        if (zM) {
                            Log.v("FragmentManager", "Transition for operation " + cVar5 + " has completed");
                        }
                        cVar5.c(this);
                    }
                });
            }
            i(arrayList2, viewGroup, new a(viewGroup, this, obj3));
            if (l.M(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + cVar3 + " to " + cVar2);
            }
        }

        @Override // androidx.fragment.app.u.a
        public final void d(gh0 gh0Var, ViewGroup viewGroup) {
            viewGroup.getClass();
            Object obj = this.q;
            if (obj != null) {
                this.f.r(obj, gh0Var.c);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v2, types: [rt2] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.fragment.app.u.a
        public final void e(ViewGroup viewGroup) {
            Object obj;
            viewGroup.getClass();
            boolean zIsLaidOut = viewGroup.isLaidOut();
            int i = 0;
            ArrayList arrayList = this.c;
            if (!zIsLaidOut) {
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    u.c cVar = ((h) obj2).a;
                    if (l.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + cVar);
                    }
                }
                return;
            }
            boolean zH = h();
            u.c cVar2 = this.e;
            u.c cVar3 = this.d;
            if (zH && (obj = this.g) != null && !a()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + cVar3 + " and " + cVar2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (a() && h()) {
                final gl8 gl8Var = new gl8();
                js7<ArrayList<View>, Object> js7VarG = g(viewGroup, cVar2, cVar3);
                ArrayList<View> arrayList2 = js7VarG.t;
                Object obj3 = js7VarG.u;
                ArrayList arrayList3 = new ArrayList(ph1.n(arrayList, 10));
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    arrayList3.add(((h) obj4).a);
                }
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj5 = arrayList3.get(i);
                    i++;
                    final u.c cVar4 = (u.c) obj5;
                    ?? r7 = new Runnable() { // from class: rt2
                        @Override // java.lang.Runnable
                        public final void run() {
                            mh4 mh4Var = (mh4) gl8Var.t;
                            if (mh4Var != null) {
                                mh4Var.invoke();
                            }
                        }
                    };
                    androidx.fragment.app.f fVar = cVar4.c;
                    this.f.v(obj3, this.p, r7, new Runnable() { // from class: st2
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zM = l.M(2);
                            u.c cVar5 = cVar4;
                            if (zM) {
                                Log.v("FragmentManager", "Transition for operation " + cVar5 + " has completed");
                            }
                            cVar5.c(this);
                        }
                    });
                }
                i(arrayList2, viewGroup, new b(viewGroup, obj3, gl8Var));
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x00af  */
        public final js7<ArrayList<View>, Object> g(ViewGroup viewGroup, final u.c cVar, final u.c cVar2) {
            ArrayList<View> arrayList;
            ArrayList<View> arrayList2;
            Object obj;
            final og4 og4Var;
            Object obj2;
            final ArrayList<View> arrayList3;
            this = this;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            ArrayList arrayList4 = this.c;
            int size = arrayList4.size();
            View view2 = null;
            boolean z = false;
            int i = 0;
            while (true) {
                arrayList = this.i;
                arrayList2 = this.h;
                obj = this.g;
                og4Var = this.f;
                if (i >= size) {
                    break;
                }
                Object obj3 = arrayList4.get(i);
                int i2 = i + 1;
                if (((h) obj3).d == null || cVar2 == null || cVar == null || this.j.isEmpty() || obj == null) {
                    z = z;
                } else {
                    androidx.fragment.app.f fVar = cVar.c;
                    androidx.fragment.app.f fVar2 = cVar2.c;
                    boolean z2 = z;
                    boolean z3 = this.o;
                    n30<String, View> n30Var = this.m;
                    kg4.a(fVar, fVar2, z3, n30Var);
                    ek7.a(viewGroup, new Runnable() { // from class: ut2
                        @Override // java.lang.Runnable
                        public final void run() {
                            f fVar3 = cVar.c;
                            f fVar4 = cVar2.c;
                            c.g gVar = this;
                            kg4.a(fVar3, fVar4, gVar.o, gVar.n);
                        }
                    });
                    arrayList2.addAll(n30Var.values());
                    ArrayList<String> arrayList5 = this.l;
                    if (!arrayList5.isEmpty()) {
                        String str = arrayList5.get(0);
                        str.getClass();
                        View view3 = n30Var.get(str);
                        og4Var.s(view3, obj);
                        view2 = view3;
                    }
                    n30<String, View> n30Var2 = this.n;
                    arrayList.addAll(n30Var2.values());
                    ArrayList<String> arrayList6 = this.k;
                    if (arrayList6.isEmpty()) {
                        z = z2;
                    } else {
                        String str2 = arrayList6.get(0);
                        str2.getClass();
                        final View view4 = n30Var2.get(str2);
                        if (view4 != null) {
                            ek7.a(viewGroup, new Runnable() { // from class: vt2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    og4Var.getClass();
                                    og4.j(rect, view4);
                                }
                            });
                            z = true;
                        } else {
                            z = z2;
                        }
                    }
                    og4Var.w(obj, view, arrayList2);
                    og4 og4Var2 = this.f;
                    Object obj4 = this.g;
                    og4Var2.q(obj4, null, null, obj4, arrayList);
                }
                size = size;
                i = i2;
            }
            boolean z4 = z;
            ArrayList arrayList7 = new ArrayList();
            int size2 = arrayList4.size();
            Object objO = null;
            Object objO2 = null;
            int i3 = 0;
            while (true) {
                arrayList2 = arrayList2;
                if (i3 >= size2) {
                    break;
                }
                arrayList4 = arrayList4;
                h hVar = (h) arrayList4.get(i3);
                size2 = size2;
                u.c cVar3 = hVar.a;
                i3++;
                Object objH = og4Var.h(hVar.b);
                if (objH != null) {
                    Object obj5 = obj;
                    ArrayList<View> arrayList8 = new ArrayList<>();
                    Object obj6 = objO2;
                    androidx.fragment.app.f fVar3 = cVar3.c;
                    Object obj7 = objO;
                    View view5 = fVar3.mView;
                    view5.getClass();
                    f(view5, arrayList8);
                    if (obj5 != null && (cVar3 == cVar2 || cVar3 == cVar)) {
                        if (cVar3 == cVar2) {
                            arrayList8.removeAll(th1.X(arrayList2));
                        } else {
                            arrayList8.removeAll(th1.X(arrayList));
                        }
                    }
                    if (arrayList8.isEmpty()) {
                        og4Var.a(view, objH);
                        obj2 = objH;
                        arrayList3 = arrayList8;
                    } else {
                        og4Var.b(objH, arrayList8);
                        this.f.q(objH, objH, arrayList8, null, null);
                        obj2 = objH;
                        arrayList3 = arrayList8;
                        if (cVar3.a == u.c.b.v) {
                            cVar3.i = false;
                            ArrayList<View> arrayList9 = new ArrayList<>(arrayList3);
                            arrayList9.remove(fVar3.mView);
                            og4Var.p(obj2, fVar3.mView, arrayList9);
                            ek7.a(viewGroup, new Runnable() { // from class: wt2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    kg4.c(4, arrayList3);
                                }
                            });
                        }
                    }
                    if (cVar3.a == u.c.b.u) {
                        arrayList7.addAll(arrayList3);
                        if (z4) {
                            og4Var.t(obj2, rect);
                        }
                        if (l.M(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + obj2);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            int i4 = 0;
                            for (int size3 = arrayList3.size(); i4 < size3; size3 = size3) {
                                View view6 = arrayList3.get(i4);
                                i4++;
                                view6.getClass();
                                Log.v("FragmentManager", "View: " + view6);
                            }
                        }
                    } else {
                        og4Var.s(view2, obj2);
                        if (l.M(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + obj2);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            int i5 = 0;
                            for (int size4 = arrayList3.size(); i5 < size4; size4 = size4) {
                                View view7 = arrayList3.get(i5);
                                i5++;
                                view7.getClass();
                                Log.v("FragmentManager", "View: " + view7);
                            }
                        }
                    }
                    if (hVar.c) {
                        objO = og4Var.o(obj7, obj2);
                        arrayList2 = arrayList2;
                        size2 = size2;
                        arrayList4 = arrayList4;
                        i3 = i3;
                        obj = obj5;
                        objO2 = obj6;
                    } else {
                        objO2 = og4Var.o(obj6, obj2);
                        objO = obj7;
                        obj = obj5;
                    }
                }
            }
            Object objN = og4Var.n(objO, objO2, obj);
            if (l.M(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objN + " for container " + viewGroup);
            }
            return new js7<>(arrayList7, objN);
        }

        public final boolean h() {
            ArrayList arrayList = this.c;
            if (arrayList != null && arrayList.isEmpty()) {
                return true;
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!((h) obj).a.c.mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        public final void i(ArrayList<View> arrayList, ViewGroup viewGroup, mh4<g2b> mh4Var) {
            kg4.c(4, arrayList);
            og4 og4Var = this.f;
            og4Var.getClass();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<View> arrayList3 = this.i;
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                View view = arrayList3.get(i);
                WeakHashMap<View, fib> weakHashMap = egb.a;
                arrayList2.add(view.getTransitionName());
                view.setTransitionName(null);
            }
            boolean zM = l.M(2);
            ArrayList<View> arrayList4 = this.h;
            if (zM) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    View view2 = arrayList4.get(i2);
                    i2++;
                    view2.getClass();
                    View view3 = view2;
                    StringBuilder sb = new StringBuilder("View: ");
                    sb.append(view3);
                    sb.append(" Name: ");
                    WeakHashMap<View, fib> weakHashMap2 = egb.a;
                    sb.append(view3.getTransitionName());
                    Log.v("FragmentManager", sb.toString());
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                int size3 = arrayList3.size();
                int i3 = 0;
                while (i3 < size3) {
                    View view4 = arrayList3.get(i3);
                    i3++;
                    view4.getClass();
                    View view5 = view4;
                    StringBuilder sb2 = new StringBuilder("View: ");
                    sb2.append(view5);
                    sb2.append(" Name: ");
                    WeakHashMap<View, fib> weakHashMap3 = egb.a;
                    sb2.append(view5.getTransitionName());
                    Log.v("FragmentManager", sb2.toString());
                }
            }
            mh4Var.invoke();
            int size4 = arrayList3.size();
            ArrayList arrayList5 = new ArrayList();
            for (int i4 = 0; i4 < size4; i4++) {
                View view6 = arrayList4.get(i4);
                WeakHashMap<View, fib> weakHashMap4 = egb.a;
                String transitionName = view6.getTransitionName();
                arrayList5.add(transitionName);
                if (transitionName != null) {
                    view6.setTransitionName(null);
                    String str = this.j.get(transitionName);
                    for (int i5 = 0; i5 < size4; i5++) {
                        if (str.equals(arrayList2.get(i5))) {
                            arrayList3.get(i5).setTransitionName(transitionName);
                            break;
                        }
                    }
                }
            }
            ek7.a(viewGroup, new ng4(size4, arrayList3, arrayList2, arrayList4, arrayList5));
            kg4.c(0, arrayList);
            og4Var.x(this.g, arrayList4, arrayList3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h extends f {
        public final Object b;
        public final boolean c;
        public final Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(u.c cVar, boolean z, boolean z2) {
            super(cVar);
            androidx.fragment.app.f fVar = cVar.c;
            u.c.b bVar = cVar.a;
            u.c.b bVar2 = u.c.b.u;
            this.b = bVar == bVar2 ? z ? fVar.getReenterTransition() : fVar.getEnterTransition() : z ? fVar.getReturnTransition() : fVar.getExitTransition();
            this.c = cVar.a == bVar2 ? z ? fVar.getAllowReturnTransitionOverlap() : fVar.getAllowEnterTransitionOverlap() : true;
            this.d = z2 ? z ? fVar.getSharedElementReturnTransition() : fVar.getSharedElementEnterTransition() : null;
        }

        public final og4 b() {
            Object obj = this.b;
            og4 og4VarC = c(obj);
            Object obj2 = this.d;
            og4 og4VarC2 = c(obj2);
            if (og4VarC == null || og4VarC2 == null || og4VarC == og4VarC2) {
                return og4VarC == null ? og4VarC2 : og4VarC;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final og4 c(Object obj) {
            if (obj == null) {
                return null;
            }
            lg4 lg4Var = kg4.a;
            if (lg4Var != null && (obj instanceof Transition)) {
                return lg4Var;
            }
            og4 og4Var = kg4.b;
            if (og4Var != null && og4Var.g(obj)) {
                return og4Var;
            }
            StringBuilder sb = new StringBuilder("Transition ");
            sb.append(obj);
            androidx.fragment.app.f fVar = this.a.c;
            sb.append(" for fragment ");
            sb.append(fVar);
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void n(n30 n30Var, View view) {
        WeakHashMap<View, fib> weakHashMap = egb.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            n30Var.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    n(n30Var, childAt);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:192:0x0528 A[LOOP:21: B:191:0x0526->B:192:0x0528, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.u
    public final void b(ArrayList arrayList, boolean z) {
        u.c.b bVar;
        u.c.b bVar2;
        u.c.b bVar3;
        float f2;
        Object obj;
        int i;
        Object objPrevious;
        ArrayList arrayList2;
        g gVar;
        u.c.b bVar4;
        int size;
        int i2;
        String strB;
        u.c.b bVar5;
        u.c.b bVar6;
        int i3 = 2;
        if (l.M(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        int size2 = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            bVar = u.c.b.v;
            bVar2 = u.c.b.u;
            bVar3 = u.c.b.w;
            if (i5 >= size2) {
                f2 = 0.0f;
                obj = null;
                break;
            }
            obj = arrayList.get(i5);
            i5++;
            f2 = 0.0f;
            u.c cVar = (u.c) obj;
            View view = cVar.c.mView;
            view.getClass();
            if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                bVar6 = bVar3;
            } else {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    bVar6 = bVar2;
                } else if (visibility == 4) {
                    bVar6 = bVar3;
                } else {
                    if (visibility != 8) {
                        z90.a(pp2.a(visibility, "Unknown visibility "));
                        return;
                    }
                    bVar6 = bVar;
                }
            }
            if (bVar6 == bVar2 && cVar.a != bVar2) {
                break;
            }
        }
        u.c cVar2 = (u.c) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = i3;
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            u.c cVar3 = (u.c) objPrevious;
            i = i3;
            View view2 = cVar3.c.mView;
            view2.getClass();
            if (view2.getAlpha() == f2 && view2.getVisibility() == 0) {
                bVar5 = bVar3;
            } else {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    bVar5 = bVar2;
                } else if (visibility2 == 4) {
                    bVar5 = bVar3;
                } else {
                    if (visibility2 != 8) {
                        z90.a(pp2.a(visibility2, "Unknown visibility "));
                        return;
                    }
                    bVar5 = bVar;
                }
            }
            if (bVar5 != bVar2 && cVar3.a == bVar2) {
                break;
            } else {
                i3 = i;
            }
        }
        u.c cVar4 = (u.c) objPrevious;
        if (l.M(i)) {
            Log.v("FragmentManager", "Executing operations from " + cVar2 + " to " + cVar4);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        androidx.fragment.app.f fVar = ((u.c) th1.G(arrayList)).c;
        int size3 = arrayList.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj2 = arrayList.get(i6);
            i6++;
            androidx.fragment.app.f.k kVar = ((u.c) obj2).c.mAnimationInfo;
            androidx.fragment.app.f.k kVar2 = fVar.mAnimationInfo;
            kVar.b = kVar2.b;
            kVar.c = kVar2.c;
            kVar.d = kVar2.d;
            kVar.e = kVar2.e;
        }
        int size4 = arrayList.size();
        int i7 = 0;
        while (i7 < size4) {
            Object obj3 = arrayList.get(i7);
            i7++;
            u.c cVar5 = (u.c) obj3;
            arrayList3.add(new b(cVar5, z));
            arrayList4.add(new h(cVar5, z, !z ? cVar5 != cVar4 : cVar5 != cVar2));
            cVar5.d.add(new pt2(i4, this, cVar5));
        }
        ArrayList arrayList5 = new ArrayList();
        int size5 = arrayList4.size();
        int i8 = 0;
        while (i8 < size5) {
            Object obj4 = arrayList4.get(i8);
            i8++;
            if (!((h) obj4).a()) {
                arrayList5.add(obj4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList5.size();
        int i9 = 0;
        while (i9 < size6) {
            Object obj5 = arrayList5.get(i9);
            i9++;
            if (((h) obj5).b() != null) {
                arrayList6.add(obj5);
            }
        }
        int size7 = arrayList6.size();
        int i10 = 0;
        og4 og4Var = null;
        while (i10 < size7) {
            Object obj6 = arrayList6.get(i10);
            i10++;
            h hVar = (h) obj6;
            og4 og4VarB = hVar.b();
            if (og4Var != null && og4VarB != og4Var) {
                StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(hVar.a.c);
                Object obj7 = hVar.b;
                sb.append(" returned Transition ");
                sb.append(obj7);
                sb.append(" which uses a different Transition type than other Fragments.");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            og4Var = og4VarB;
        }
        if (og4Var == null) {
            arrayList2 = arrayList3;
            bVar4 = bVar;
        } else {
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            n30 n30Var = new n30();
            ArrayList<String> arrayList9 = new ArrayList<>();
            ArrayList<String> arrayList10 = new ArrayList<>();
            n30 n30Var2 = new n30();
            n30 n30Var3 = new n30();
            int size8 = arrayList6.size();
            ArrayList<String> sharedElementSourceNames = arrayList10;
            int i11 = 0;
            Object obj8 = null;
            while (i11 < size8) {
                Object obj9 = arrayList6.get(i11);
                int i12 = i11 + 1;
                size8 = size8;
                Object obj10 = ((h) obj9).d;
                if (obj10 == null || cVar2 == null) {
                    i11 = i12;
                    i11 = i11;
                    size8 = size8;
                    arrayList8 = arrayList8;
                    arrayList3 = arrayList3;
                } else {
                    i11 = i12;
                    androidx.fragment.app.f fVar2 = cVar2.c;
                    if (cVar4 != null) {
                        androidx.fragment.app.f fVar3 = cVar4.c;
                        Object objY = og4Var.y(og4Var.h(obj10));
                        sharedElementSourceNames = fVar3.getSharedElementSourceNames();
                        sharedElementSourceNames.getClass();
                        ArrayList<String> sharedElementSourceNames2 = fVar2.getSharedElementSourceNames();
                        sharedElementSourceNames2.getClass();
                        arrayList8 = arrayList8;
                        ArrayList<String> sharedElementTargetNames = fVar2.getSharedElementTargetNames();
                        sharedElementTargetNames.getClass();
                        int size9 = sharedElementTargetNames.size();
                        arrayList3 = arrayList3;
                        int i13 = 0;
                        while (i13 < size9) {
                            int i14 = size9;
                            int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i13));
                            if (iIndexOf != -1) {
                                sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i13));
                            }
                            i13++;
                            size9 = i14;
                        }
                        arrayList9 = fVar3.getSharedElementTargetNames();
                        arrayList9.getClass();
                        js7 js7Var = !z ? new js7(fVar2.getExitTransitionCallback(), fVar3.getEnterTransitionCallback()) : new js7(fVar2.getEnterTransitionCallback(), fVar3.getExitTransitionCallback());
                        yl9 yl9Var = (yl9) js7Var.t;
                        yl9 yl9Var2 = (yl9) js7Var.u;
                        int size10 = sharedElementSourceNames.size();
                        int i15 = 0;
                        while (i15 < size10) {
                            String str = sharedElementSourceNames.get(i15);
                            str.getClass();
                            yl9 yl9Var3 = yl9Var;
                            String str2 = str;
                            String str3 = arrayList9.get(i15);
                            str3.getClass();
                            n30Var.put(str2, str3);
                            i15++;
                            yl9Var = yl9Var3;
                            yl9Var2 = yl9Var2;
                        }
                        yl9 yl9Var4 = yl9Var;
                        yl9 yl9Var5 = yl9Var2;
                        if (l.M(i)) {
                            Log.v("FragmentManager", ">>> entering view names <<<");
                            int i16 = 0;
                            for (int size11 = arrayList9.size(); i16 < size11; size11 = size11) {
                                String str4 = arrayList9.get(i16);
                                i16++;
                                Log.v("FragmentManager", "Name: " + str4);
                            }
                            Log.v("FragmentManager", ">>> exiting view names <<<");
                            int i17 = 0;
                            for (int size12 = sharedElementSourceNames.size(); i17 < size12; size12 = size12) {
                                String str5 = sharedElementSourceNames.get(i17);
                                i17++;
                                Log.v("FragmentManager", "Name: " + str5);
                            }
                        }
                        View view3 = fVar2.mView;
                        view3.getClass();
                        n(n30Var2, view3);
                        n30Var2.m(sharedElementSourceNames);
                        if (yl9Var4 != null) {
                            if (l.M(i)) {
                                Log.v("FragmentManager", "Executing exit callback for operation " + cVar2);
                            }
                            int size13 = sharedElementSourceNames.size() - 1;
                            if (size13 >= 0) {
                                while (true) {
                                    int i18 = size13 - 1;
                                    String str6 = sharedElementSourceNames.get(size13);
                                    str6.getClass();
                                    String str7 = str6;
                                    View view4 = (View) n30Var2.get(str7);
                                    if (view4 == null) {
                                        n30Var.remove(str7);
                                    } else {
                                        WeakHashMap<View, fib> weakHashMap = egb.a;
                                        if (!str7.equals(view4.getTransitionName())) {
                                            n30Var.put(view4.getTransitionName(), (String) n30Var.remove(str7));
                                        }
                                    }
                                    if (i18 < 0) {
                                        break;
                                    } else {
                                        size13 = i18;
                                    }
                                }
                            }
                        } else {
                            n30Var.m(n30Var2.keySet());
                        }
                        View view5 = fVar3.mView;
                        view5.getClass();
                        n(n30Var3, view5);
                        n30Var3.m(arrayList9);
                        n30Var3.m(n30Var.values());
                        if (yl9Var5 != null) {
                            if (l.M(i)) {
                                Log.v("FragmentManager", "Executing enter callback for operation " + cVar4);
                            }
                            int size14 = arrayList9.size() - 1;
                            if (size14 >= 0) {
                                while (true) {
                                    int i19 = size14 - 1;
                                    String str8 = arrayList9.get(size14);
                                    str8.getClass();
                                    String str9 = str8;
                                    View view6 = (View) n30Var3.get(str9);
                                    if (view6 == null) {
                                        String strB2 = kg4.b(n30Var, str9);
                                        if (strB2 != null) {
                                            n30Var.remove(strB2);
                                        }
                                    } else {
                                        WeakHashMap<View, fib> weakHashMap2 = egb.a;
                                        if (!str9.equals(view6.getTransitionName()) && (strB = kg4.b(n30Var, str9)) != null) {
                                            n30Var.put(strB, view6.getTransitionName());
                                        }
                                    }
                                    if (i19 < 0) {
                                        break;
                                    } else {
                                        size14 = i19;
                                    }
                                }
                            }
                        } else {
                            lg4 lg4Var = kg4.a;
                            for (int i20 = n30Var.v - 1; -1 < i20; i20--) {
                                if (!n30Var3.containsKey((String) n30Var.j(i20))) {
                                    n30Var.h(i20);
                                }
                            }
                        }
                        Set setKeySet = n30Var.keySet();
                        Iterator it = ((n30.a) n30Var2.entrySet()).iterator();
                        while (it.hasNext()) {
                            it.next();
                            View view7 = (View) ((Map.Entry) it).getValue();
                            WeakHashMap<View, fib> weakHashMap3 = egb.a;
                            if (!th1.u(setKeySet, view7.getTransitionName())) {
                                it.remove();
                            }
                        }
                        Collection collectionValues = n30Var.values();
                        Iterator it2 = ((n30.a) n30Var3.entrySet()).iterator();
                        while (it2.hasNext()) {
                            it2.next();
                            View view8 = (View) ((Map.Entry) it2).getValue();
                            WeakHashMap<View, fib> weakHashMap4 = egb.a;
                            if (!th1.u(collectionValues, view8.getTransitionName())) {
                                it2.remove();
                            }
                        }
                        if (n30Var.isEmpty()) {
                            Log.i("FragmentManager", "Ignoring shared elements transition " + objY + " between " + cVar2 + " and " + cVar4 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                            arrayList7.clear();
                            arrayList8.clear();
                            obj8 = null;
                        } else {
                            obj8 = objY;
                        }
                    } else {
                        i11 = i11;
                        size8 = size8;
                        arrayList8 = arrayList8;
                        arrayList3 = arrayList3;
                    }
                }
            }
            og4 og4Var2 = og4Var;
            ArrayList arrayList11 = arrayList8;
            arrayList2 = arrayList3;
            if (obj8 != null) {
                bVar4 = bVar;
                gVar = new g(arrayList6, cVar2, cVar4, og4Var2, obj8, arrayList7, arrayList11, n30Var, arrayList9, sharedElementSourceNames, n30Var2, n30Var3, z);
                size = arrayList6.size();
                i2 = 0;
                while (i2 < size) {
                    Object obj11 = arrayList6.get(i2);
                    i2++;
                    ((h) obj11).a.j.add(gVar);
                }
            } else {
                if (!arrayList6.isEmpty()) {
                    int size15 = arrayList6.size();
                    int i21 = 0;
                    while (true) {
                        if (i21 < size15) {
                            Object obj12 = arrayList6.get(i21);
                            i21++;
                            if (((h) obj12).b != null) {
                                bVar4 = bVar;
                                gVar = new g(arrayList6, cVar2, cVar4, og4Var2, obj8, arrayList7, arrayList11, n30Var, arrayList9, sharedElementSourceNames, n30Var2, n30Var3, z);
                                size = arrayList6.size();
                                i2 = 0;
                                while (i2 < size) {
                                    Object obj13 = arrayList6.get(i2);
                                    i2++;
                                    ((h) obj13).a.j.add(gVar);
                                }
                            }
                        }
                    }
                }
                bVar4 = bVar;
            }
        }
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        int size16 = arrayList2.size();
        int i22 = 0;
        while (i22 < size16) {
            Object obj14 = arrayList2.get(i22);
            i22++;
            rh1.o(((b) obj14).a.k, arrayList13);
        }
        ArrayList arrayList14 = arrayList2;
        boolean zIsEmpty = arrayList13.isEmpty();
        int size17 = arrayList14.size();
        boolean z2 = false;
        int i23 = 0;
        while (i23 < size17) {
            Object obj15 = arrayList14.get(i23);
            i23++;
            b bVar7 = (b) obj15;
            Context context = this.a.getContext();
            u.c cVar6 = bVar7.a;
            context.getClass();
            androidx.fragment.app.h.a aVarB = bVar7.b(context);
            if (aVarB != null) {
                if (aVarB.b == null) {
                    arrayList12.add(bVar7);
                } else {
                    androidx.fragment.app.f fVar4 = cVar6.c;
                    if (cVar6.k.isEmpty()) {
                        if (cVar6.a == bVar4) {
                            cVar6.i = false;
                        }
                        cVar6.j.add(new C0017c(bVar7));
                        z2 = true;
                    } else if (l.M(i)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + fVar4 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        int i24 = 0;
        int size18 = arrayList12.size();
        while (i24 < size18) {
            Object obj16 = arrayList12.get(i24);
            i24++;
            b bVar8 = (b) obj16;
            u.c cVar7 = bVar8.a;
            androidx.fragment.app.f fVar5 = cVar7.c;
            if (zIsEmpty) {
                if (!z2) {
                    cVar7.j.add(new a(bVar8));
                } else if (l.M(i)) {
                    Log.v(r3, "Ignoring Animation set on " + fVar5 + " as Animations cannot run alongside Animators.");
                }
            } else if (l.M(i)) {
                Log.v(r3, "Ignoring Animation set on " + fVar5 + " as Animations cannot run alongside Transitions.");
            }
        }
    }
}
