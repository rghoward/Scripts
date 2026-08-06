package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.hwpo_training_app.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<yt1> cachedViewTreeCompositionContext;
    private et1 composeViewContext;
    private xt1 composition;
    private boolean creatingComposition;
    private mh4<g2b> disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private yt1 parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements ci4<jt1, Integer, g2b> {
        public a() {
            super(2);
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                v0.this.Content(jt1Var2, 0);
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hgb, java.lang.Object] */
    public v0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        jgb jgbVar = new jgb(this);
        addOnAttachStateChangeListener(jgbVar);
        ?? r2 = new u58() { // from class: hgb
            @Override // defpackage.u58
            public final void a() {
                this.a.disposeComposition();
            }
        };
        uy5.c(this).a.add((u58) r2);
        this.disposeViewCompositionStrategy = new igb(this, jgbVar, r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachedToWindow() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.composeViewContext == null) {
                cm cmVar = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof cm) {
                        cmVar = (cm) childAt;
                    }
                }
                if (cmVar != null) {
                    cmVar.setComposeViewContext(updateAutoCreatedComposeViewContext(xx.c(this), cmVar.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                ensureCompositionCreated();
            }
        }
    }

    private final yt1 cacheIfAlive(yt1 yt1Var) {
        yt1 yt1Var2 = isAlive(yt1Var) ? yt1Var : null;
        if (yt1Var2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(yt1Var2);
        }
        return yt1Var;
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    et1 et1VarResolveComposeViewContext = this.composeViewContext;
                    if (et1VarResolveComposeViewContext == null) {
                        et1VarResolveComposeViewContext = resolveComposeViewContext();
                    }
                    this.composition = vqb.a(this, et1VarResolveComposeViewContext, new fr1(true, 1003123809, new a()));
                    g2b g2bVar = g2b.a;
                    Trace.endSection();
                    this.creatingComposition = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.creatingComposition = false;
                throw th2;
            }
        }
    }

    private final boolean isAlive(yt1 yt1Var) {
        return !(yt1Var instanceof gk8) || ((gk8.d) ((gk8) yt1Var).u.getValue()).compareTo(gk8.d.u) > 0;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    private final et1 resolveComposeViewContext() {
        et1 composeViewContext;
        whb whbVar;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            cm cmVar = childAt instanceof cm ? (cm) childAt : null;
            if (cmVar != null) {
                composeViewContext = cmVar.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewC = xx.c(this);
        et1 et1VarD = xx.d(viewC);
        if (et1VarD != null) {
            return updateAutoCreatedComposeViewContext(viewC, et1VarD);
        }
        yt1 yt1VarResolveParentCompositionContext = resolveParentCompositionContext();
        m76 m76VarA = vib.a(viewC);
        if (m76VarA == null) {
            m76VarA = composeViewContext != null ? composeViewContext.c : null;
            if (m76VarA == null) {
                aa0.c("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        m76 m76Var = m76VarA;
        f19 f19VarA = sy.a(viewC);
        if (f19VarA == null) {
            f19VarA = composeViewContext != null ? composeViewContext.d : null;
            if (f19VarA == null) {
                aa0.c("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        f19 f19Var = f19VarA;
        whb whbVarE = ty.e(viewC);
        if (whbVarE == null) {
            whbVar = composeViewContext != null ? composeViewContext.e : null;
        } else {
            whbVar = whbVarE;
        }
        et1 et1Var = new et1(xx.d(xx.c(viewC)), viewC, yt1VarResolveParentCompositionContext, m76Var, f19Var, whbVar);
        viewC.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(et1Var));
        return et1Var;
    }

    private final yt1 resolveParentCompositionContext() {
        gk8 gk8VarA;
        yt1 yt1VarCacheIfAlive = this.parentContext;
        if (yt1VarCacheIfAlive == null) {
            yt1 yt1VarA = dob.a(this);
            if (yt1VarA == null) {
                Object parent = getParent();
                while (yt1VarA == null && (parent instanceof View)) {
                    View view = (View) parent;
                    yt1VarA = dob.a(view);
                    parent = bza.g(view);
                }
            }
            yt1VarCacheIfAlive = yt1VarA != null ? cacheIfAlive(yt1VarA) : null;
            if (yt1VarCacheIfAlive == null) {
                WeakReference<yt1> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference == null || (yt1VarCacheIfAlive = weakReference.get()) == null || !isAlive(yt1VarCacheIfAlive)) {
                    yt1VarCacheIfAlive = null;
                }
                if (yt1VarCacheIfAlive == null) {
                    if (!isAttachedToWindow()) {
                        uc5.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object objG = bza.g(this);
                    View view2 = this;
                    while (objG instanceof View) {
                        View view3 = (View) objG;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        objG = view3.getParent();
                    }
                    yt1 yt1VarA2 = dob.a(view2);
                    if (yt1VarA2 == null) {
                        gk8VarA = ynb.a.get().a(view2);
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, gk8VarA);
                        Handler handler = view2.getHandler();
                        int i = it4.a;
                        view2.addOnAttachStateChangeListener(new wnb(oy0.d(dn4.t, new gt4(handler, "windowRecomposer cleanup", false).y, null, new xnb(gk8VarA, view2, null), 2)));
                    } else {
                        if (!(yt1VarA2 instanceof gk8)) {
                            aa0.c("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        gk8VarA = (gk8) yt1VarA2;
                    }
                    return cacheIfAlive(gk8VarA);
                }
            }
        }
        return yt1VarCacheIfAlive;
    }

    private final void setParentContext(yt1 yt1Var) {
        if (this.parentContext != yt1Var) {
            this.parentContext = yt1Var;
            if (yt1Var != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            xt1 xt1Var = this.composition;
            if (xt1Var != null) {
                xt1Var.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    private final et1 updateAutoCreatedComposeViewContext(View view, et1 et1Var) {
        yt1 yt1VarResolveParentCompositionContext = resolveParentCompositionContext();
        m76 m76VarA = vib.a(view);
        whb whbVarE = ty.e(view);
        f19 f19VarA = sy.a(view);
        yt1 yt1Var = et1Var.b;
        f19 f19Var = et1Var.d;
        m76 m76Var = et1Var.c;
        if (yt1VarResolveParentCompositionContext == yt1Var && m76VarA == m76Var && whbVarE == et1Var.e && f19VarA == f19Var) {
            return et1Var;
        }
        if (yt1VarResolveParentCompositionContext.k() != et1Var.b.k()) {
            disposeComposition();
        }
        if (m76VarA == null) {
            m76VarA = m76Var;
        }
        et1 et1Var2 = new et1(et1Var, view, yt1VarResolveParentCompositionContext, m76VarA, f19VarA == null ? f19Var : f19VarA, whbVarE);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(et1Var2));
        return et1Var2;
    }

    public abstract void Content(jt1 jt1Var, int i);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        checkAddView();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void createComposition() {
        et1 et1Var;
        View view;
        if (this.parentContext == null && !isAttachedToWindow() && ((et1Var = this.composeViewContext) == null || et1Var == null || (view = et1Var.a) == null || !view.isAttachedToWindow())) {
            aa0.c("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            ensureCompositionCreated();
        }
    }

    public final void disposeComposition() {
        View childAt = getChildAt(0);
        cm cmVar = childAt instanceof cm ? (cm) childAt : null;
        if (cmVar != null && cmVar.c1) {
            cmVar.getComposeViewContext().b();
            cmVar.c1 = false;
        }
        xt1 xt1Var = this.composition;
        if (xt1Var != null) {
            xt1Var.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m885getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        ua0 ua0Var = tag instanceof ua0 ? (ua0) tag : null;
        if (ua0Var != null) {
            return ua0Var.a;
        }
        return 1;
    }

    public final et1 getComposeViewContext$ui() {
        return this.composeViewContext;
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c37<Context, zz9<Float>> c37Var = dob.a;
        Object objG = bza.g(this);
        View view = this;
        while (objG instanceof View) {
            View view2 = (View) objG;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objG = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new Runnable() { // from class: u0
                @Override // java.lang.Runnable
                public final void run() {
                    this.t.attachedToWindow();
                }
            });
        } else {
            attachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        internalOnLayout$ui(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ensureCompositionCreated();
        internalOnMeasure$ui(i, i2);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m886setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new ua0(i));
    }

    public final void setComposeViewContext$ui(et1 et1Var) {
        if (this.composeViewContext != et1Var) {
            if (et1Var == null) {
                disposeComposition();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                cm cmVar = childAt instanceof cm ? (cm) childAt : null;
                if (cmVar != null) {
                    if (cmVar.getCoroutineContext() != et1Var.b.k()) {
                        disposeComposition();
                    }
                    cmVar.setComposeViewContext(et1Var);
                }
            }
            this.composeViewContext = et1Var;
        }
    }

    public final void setParentCompositionContext(yt1 yt1Var) {
        setParentContext(yt1Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((mn7) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(kgb kgbVar) {
        mh4<g2b> mh4Var = this.disposeViewCompositionStrategy;
        if (mh4Var != null) {
            mh4Var.invoke();
        }
        this.disposeViewCompositionStrategy = kgbVar.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        checkAddView();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        checkAddView();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        checkAddView();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public final void createComposition(et1 et1Var) {
        if (et1Var.a.isAttachedToWindow()) {
            setComposeViewContext$ui(et1Var);
            ensureCompositionCreated();
        } else {
            aa0.c("createComposition requires the ComposeViewContext's view to be attached to a window.");
        }
    }

    public v0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public v0(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ v0(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
