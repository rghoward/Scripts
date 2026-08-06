package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lmb extends q8 implements ActionBarOverlayLayout.d {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public rn2 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public d i;
    public d j;
    public gz.e k;
    public boolean l;
    public final ArrayList<q8.b> m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public gib s;
    public boolean t;
    public boolean u;
    public final a v;
    public final b w;
    public final c x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends nq2 {
        public a() {
        }

        @Override // defpackage.hib
        public final void b() {
            View view;
            lmb lmbVar = lmb.this;
            if (lmbVar.o && (view = lmbVar.g) != null) {
                view.setTranslationY(0.0f);
                lmbVar.d.setTranslationY(0.0f);
            }
            lmbVar.d.setVisibility(8);
            lmbVar.d.setTransitioning(false);
            lmbVar.s = null;
            gz.e eVar = lmbVar.k;
            if (eVar != null) {
                eVar.b(lmbVar.j);
                lmbVar.j = null;
                lmbVar.k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = lmbVar.c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, fib> weakHashMap = egb.a;
                actionBarOverlayLayout.requestApplyInsets();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b extends nq2 {
        public b() {
        }

        @Override // defpackage.hib
        public final void b() {
            lmb lmbVar = lmb.this;
            lmbVar.s = null;
            lmbVar.d.requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c implements iib {
        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d extends u8 implements f.a {
        public final Context v;
        public final f w;
        public gz.e x;
        public WeakReference<View> y;

        public d(Context context, gz.e eVar) {
            this.v = context;
            this.x = eVar;
            f fVar = new f(context);
            fVar.l = 1;
            this.w = fVar;
            fVar.e = this;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(f fVar, MenuItem menuItem) {
            gz.e eVar = this.x;
            if (eVar != null) {
                return eVar.a.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(f fVar) {
            if (this.x == null) {
                return;
            }
            i();
            androidx.appcompat.widget.a aVar = lmb.this.f.w;
            if (aVar != null) {
                aVar.n();
            }
        }

        @Override // defpackage.u8
        public final void c() {
            lmb lmbVar = lmb.this;
            if (lmbVar.i != this) {
                return;
            }
            if (lmbVar.p) {
                lmbVar.j = this;
                lmbVar.k = this.x;
            } else {
                this.x.b(this);
            }
            this.x = null;
            lmbVar.q(false);
            ActionBarContextView actionBarContextView = lmbVar.f;
            if (actionBarContextView.D == null) {
                actionBarContextView.h();
            }
            lmbVar.c.setHideOnContentScrollEnabled(lmbVar.u);
            lmbVar.i = null;
        }

        @Override // defpackage.u8
        public final View d() {
            WeakReference<View> weakReference = this.y;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // defpackage.u8
        public final f e() {
            return this.w;
        }

        @Override // defpackage.u8
        public final MenuInflater f() {
            return new r5a(this.v);
        }

        @Override // defpackage.u8
        public final CharSequence g() {
            return lmb.this.f.getSubtitle();
        }

        @Override // defpackage.u8
        public final CharSequence h() {
            return lmb.this.f.getTitle();
        }

        @Override // defpackage.u8
        public final void i() {
            if (lmb.this.i != this) {
                return;
            }
            f fVar = this.w;
            fVar.w();
            try {
                this.x.d(this, fVar);
            } finally {
                fVar.v();
            }
        }

        @Override // defpackage.u8
        public final boolean j() {
            return lmb.this.f.L;
        }

        @Override // defpackage.u8
        public final void k(View view) {
            lmb.this.f.setCustomView(view);
            this.y = new WeakReference<>(view);
        }

        @Override // defpackage.u8
        public final void l(int i) {
            m(lmb.this.a.getResources().getString(i));
        }

        @Override // defpackage.u8
        public final void m(CharSequence charSequence) {
            lmb.this.f.setSubtitle(charSequence);
        }

        @Override // defpackage.u8
        public final void n(int i) {
            o(lmb.this.a.getResources().getString(i));
        }

        @Override // defpackage.u8
        public final void o(CharSequence charSequence) {
            lmb.this.f.setTitle(charSequence);
        }

        @Override // defpackage.u8
        public final void p(boolean z) {
            this.u = z;
            lmb.this.f.setTitleOptional(z);
        }
    }

    public lmb(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new a();
        this.w = new b();
        this.x = new c();
        View decorView = activity.getWindow().getDecorView();
        r(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    @Override // defpackage.q8
    public final boolean b() {
        rn2 rn2Var = this.e;
        if (rn2Var == null || !rn2Var.i()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    @Override // defpackage.q8
    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList<q8.b> arrayList = this.m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
    }

    @Override // defpackage.q8
    public final int d() {
        return this.e.o();
    }

    @Override // defpackage.q8
    public final Context e() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.hwpo_training_app.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // defpackage.q8
    public final void g() {
        s(this.a.getResources().getBoolean(com.hwpo_training_app.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.q8
    public final boolean i(int i, KeyEvent keyEvent) {
        f fVar;
        d dVar = this.i;
        if (dVar == null || (fVar = dVar.w) == null) {
            return false;
        }
        fVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return fVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.q8
    public final void l(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        int iO = this.e.o();
        this.h = true;
        this.e.j((i & 4) | (iO & (-5)));
    }

    @Override // defpackage.q8
    public final void m() {
        this.e.j(this.e.o() & (-9));
    }

    @Override // defpackage.q8
    public final void n(boolean z2) {
        gib gibVar;
        this.t = z2;
        if (z2 || (gibVar = this.s) == null) {
            return;
        }
        gibVar.a();
    }

    @Override // defpackage.q8
    public final void o(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    @Override // defpackage.q8
    public final u8 p(gz.e eVar) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.c();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.h();
        d dVar2 = new d(this.f.getContext(), eVar);
        f fVar = dVar2.w;
        fVar.w();
        try {
            boolean zC = dVar2.x.a.c(dVar2, fVar);
            fVar.v();
            if (!zC) {
                return null;
            }
            this.i = dVar2;
            dVar2.i();
            this.f.f(dVar2);
            q(true);
            return dVar2;
        } catch (Throwable th) {
            fVar.v();
            throw th;
        }
    }

    public final void q(boolean z2) {
        fib fibVarE;
        fib fibVarE2;
        boolean z3 = this.q;
        if (z2) {
            if (!z3) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                t(false);
            }
        } else if (z3) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            t(false);
        }
        boolean zIsLaidOut = this.d.isLaidOut();
        rn2 rn2Var = this.e;
        if (!zIsLaidOut) {
            if (z2) {
                rn2Var.n(4);
                this.f.setVisibility(0);
                return;
            } else {
                rn2Var.n(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            fibVarE = rn2Var.m(4, 100L);
            fibVarE2 = this.f.e(0, 200L);
        } else {
            fib fibVarM = rn2Var.m(0, 200L);
            fibVarE = this.f.e(8, 100L);
            fibVarE2 = fibVarM;
        }
        gib gibVar = new gib();
        ArrayList<fib> arrayList = gibVar.a;
        arrayList.add(fibVarE);
        View view = fibVarE.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = fibVarE2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(fibVarE2);
        gibVar.b();
    }

    public final void r(View view) {
        rn2 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.hwpo_training_app.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.hwpo_training_app.R.id.action_bar);
        if (callbackFindViewById instanceof rn2) {
            wrapper = (rn2) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(com.hwpo_training_app.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.hwpo_training_app.R.id.action_bar_container);
        this.d = actionBarContainer;
        rn2 rn2Var = this.e;
        if (rn2Var == null || this.f == null || actionBarContainer == null) {
            aa0.c(lmb.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        this.a = rn2Var.getContext();
        if ((this.e.o() & 4) != 0) {
            this.h = true;
        }
        Context context = this.a;
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        s(context.getResources().getBoolean(com.hwpo_training_app.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, ph8.a, com.hwpo_training_app.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.z) {
                aa0.c("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap<View, fib> weakHashMap = egb.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void s(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            this.e.k();
        } else {
            this.e.k();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        this.e.r(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void t(boolean z2) {
        boolean z3 = this.q || !this.p;
        boolean z4 = this.r;
        final c cVar = this.x;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.r = false;
                gib gibVar = this.s;
                if (gibVar != null) {
                    gibVar.a();
                }
                int i = this.n;
                a aVar = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    aVar.b();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                gib gibVar2 = new gib();
                float f = -this.d.getHeight();
                if (z2) {
                    int[] iArr = {0, 0};
                    this.d.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                fib fibVarB = egb.b(this.d);
                fibVarB.e(f);
                final View view2 = fibVarB.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: dib
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) lmb.this.d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z5 = gibVar2.e;
                ArrayList<fib> arrayList = gibVar2.a;
                if (!z5) {
                    arrayList.add(fibVarB);
                }
                if (this.o && view != null) {
                    fib fibVarB2 = egb.b(view);
                    fibVarB2.e(f);
                    if (!gibVar2.e) {
                        arrayList.add(fibVarB2);
                    }
                }
                boolean z6 = gibVar2.e;
                if (!z6) {
                    gibVar2.c = y;
                }
                if (!z6) {
                    gibVar2.b = 250L;
                }
                if (!z6) {
                    gibVar2.d = aVar;
                }
                this.s = gibVar2;
                gibVar2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.r = true;
        gib gibVar3 = this.s;
        if (gibVar3 != null) {
            gibVar3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        b bVar = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.d.setTranslationY(f2);
            gib gibVar4 = new gib();
            fib fibVarB3 = egb.b(this.d);
            fibVarB3.e(0.0f);
            final View view3 = fibVarB3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: dib
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) lmb.this.d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z7 = gibVar4.e;
            ArrayList<fib> arrayList2 = gibVar4.a;
            if (!z7) {
                arrayList2.add(fibVarB3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                fib fibVarB4 = egb.b(view);
                fibVarB4.e(0.0f);
                if (!gibVar4.e) {
                    arrayList2.add(fibVarB4);
                }
            }
            boolean z8 = gibVar4.e;
            if (!z8) {
                gibVar4.c = z;
            }
            if (!z8) {
                gibVar4.b = 250L;
            }
            if (!z8) {
                gibVar4.d = bVar;
            }
            this.s = gibVar4;
            gibVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            bVar.b();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, fib> weakHashMap = egb.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public lmb(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new a();
        this.w = new b();
        this.x = new c();
        r(dialog.getWindow().getDecorView());
    }
}
