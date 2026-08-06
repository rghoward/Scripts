package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.hwpo_training_app.R;
import defpackage.aa0;
import defpackage.av;
import defpackage.egb;
import defpackage.fg4;
import defpackage.fib;
import defpackage.frb;
import defpackage.grb;
import defpackage.i34;
import defpackage.s66;
import defpackage.ue4;
import defpackage.whb;
import defpackage.xr1;
import defpackage.z90;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final k a;
    public final q b;
    public final f c;
    public boolean d = false;
    public int e = -1;

    public p(k kVar, q qVar, ClassLoader classLoader, i iVar, Bundle bundle) {
        this.a = kVar;
        this.b = qVar;
        o oVar = (o) bundle.getParcelable("state");
        f fVarA = iVar.a(classLoader, oVar.t);
        fVarA.mWho = oVar.u;
        fVarA.mFromLayout = oVar.v;
        fVarA.mInDynamicContainer = oVar.w;
        fVarA.mRestored = true;
        fVarA.mFragmentId = oVar.x;
        fVarA.mContainerId = oVar.y;
        fVarA.mTag = oVar.z;
        fVarA.mRetainInstance = oVar.A;
        fVarA.mRemoving = oVar.B;
        fVarA.mDetached = oVar.C;
        fVarA.mHidden = oVar.D;
        fVarA.mMaxState = s66.b.values()[oVar.E];
        fVarA.mTargetWho = oVar.F;
        fVarA.mTargetRequestCode = oVar.G;
        fVarA.mUserVisibleHint = oVar.H;
        this.c = fVarA;
        fVarA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fVarA.setArguments(bundle2);
        if (l.M(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fVarA);
        }
    }

    public final void a() {
        boolean zM = l.M(3);
        f fVar = this.c;
        if (zM) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fVar);
        }
        Bundle bundle = fVar.mSavedFragmentState;
        fVar.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.a.a(fVar, false);
    }

    public final void b() {
        f fVar;
        View view;
        View view2;
        f fVar2 = this.c;
        View view3 = fVar2.mContainer;
        while (true) {
            fVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            f fVar3 = tag instanceof f ? (f) tag : null;
            if (fVar3 != null) {
                fVar = fVar3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        f parentFragment = fVar2.getParentFragment();
        if (fVar != null && !fVar.equals(parentFragment)) {
            int i = fVar2.mContainerId;
            fg4.a aVar = fg4.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(fVar2);
            sb.append(" within the view of parent fragment ");
            sb.append(fVar);
            sb.append(" via container with ID ");
            fg4.b(new grb(fVar2, i34.b(i, " without using parent's childFragmentManager", sb)));
            fg4.a(fVar2).getClass();
        }
        ArrayList<f> arrayList = this.b.a;
        ViewGroup viewGroup = fVar2.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(fVar2);
            for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
                f fVar4 = arrayList.get(i2);
                if (fVar4.mContainer == viewGroup && (view2 = fVar4.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                f fVar5 = arrayList.get(iIndexOf);
                if (fVar5.mContainer == viewGroup && (view = fVar5.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        fVar2.mContainer.addView(fVar2.mView, iIndexOfChild);
    }

    public final void c() {
        boolean zM = l.M(3);
        f fVar = this.c;
        if (zM) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fVar);
        }
        f fVar2 = fVar.mTarget;
        p pVar = null;
        q qVar = this.b;
        if (fVar2 != null) {
            p pVar2 = qVar.b.get(fVar2.mWho);
            if (pVar2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fVar);
                f fVar3 = fVar.mTarget;
                sb.append(" declared target fragment ");
                sb.append(fVar3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            fVar.mTargetWho = fVar.mTarget.mWho;
            fVar.mTarget = null;
            pVar = pVar2;
        } else {
            String str = fVar.mTargetWho;
            if (str != null && (pVar = qVar.b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fVar);
                sb2.append(" declared target fragment ");
                aa0.c(av.a(sb2, fVar.mTargetWho, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (pVar != null) {
            pVar.k();
        }
        l lVar = fVar.mFragmentManager;
        fVar.mHost = lVar.x;
        fVar.mParentFragment = lVar.z;
        k kVar = this.a;
        kVar.g(fVar, false);
        fVar.performAttach();
        kVar.b(fVar, false);
    }

    public final int d() {
        f fVar = this.c;
        if (fVar.mFragmentManager == null) {
            return fVar.mState;
        }
        int iMin = this.e;
        int iOrdinal = fVar.mMaxState.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (fVar.mFromLayout) {
            boolean z = fVar.mInLayout;
            int i = this.e;
            if (z) {
                iMin = Math.max(i, 2);
                View view = fVar.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i < 4 ? Math.min(iMin, fVar.mState) : Math.min(iMin, 1);
            }
        }
        if (fVar.mInDynamicContainer && fVar.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!fVar.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fVar.mContainer;
        u.c.a aVar = null;
        if (viewGroup != null) {
            u uVarI = u.i(viewGroup, fVar.getParentFragmentManager());
            u.c cVarF = uVarI.f(fVar);
            u.c.a aVar2 = cVarF != null ? cVarF.b : null;
            u.c cVarG = uVarI.g(fVar);
            aVar = cVarG != null ? cVarG.b : null;
            int i2 = aVar2 == null ? -1 : u.d.a[aVar2.ordinal()];
            if (i2 != -1 && i2 != 1) {
                aVar = aVar2;
            }
        }
        if (aVar == u.c.a.u) {
            iMin = Math.min(iMin, 6);
        } else if (aVar == u.c.a.v) {
            iMin = Math.max(iMin, 3);
        } else if (fVar.mRemoving) {
            iMin = fVar.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fVar.mDeferStart && fVar.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (fVar.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (l.M(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + fVar);
        }
        return iMin;
    }

    public final void e() {
        boolean zM = l.M(3);
        f fVar = this.c;
        if (zM) {
            Log.d("FragmentManager", "moveto CREATED: " + fVar);
        }
        Bundle bundle = fVar.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (fVar.mIsCreated) {
            fVar.mState = 1;
            fVar.restoreChildFragmentState();
        } else {
            k kVar = this.a;
            kVar.h(fVar, false);
            fVar.performCreate(bundle2);
            kVar.c(fVar, false);
        }
    }

    public final void f() {
        String resourceName;
        f fVar = this.c;
        if (fVar.mFromLayout) {
            return;
        }
        if (l.M(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fVar);
        }
        Bundle bundle = fVar.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fVar.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fVar.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fVar.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    z90.a(xr1.b("Cannot create fragment ", fVar, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) fVar.mFragmentManager.y.b(i);
                if (viewGroup == null) {
                    if (!fVar.mRestored && !fVar.mInDynamicContainer) {
                        try {
                            resourceName = fVar.getResources().getResourceName(fVar.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fVar.mContainerId) + " (" + resourceName + ") for fragment " + fVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    fg4.a aVar = fg4.a;
                    fg4.b(new frb(fVar, "Attempting to add fragment " + fVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    fg4.a(fVar).getClass();
                }
            }
        }
        fVar.mContainer = viewGroup;
        fVar.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (fVar.mView != null) {
            if (l.M(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fVar);
            }
            fVar.mView.setSaveFromParentEnabled(false);
            fVar.mView.setTag(R.id.fragment_container_view_tag, fVar);
            if (viewGroup != null) {
                b();
            }
            if (fVar.mHidden) {
                fVar.mView.setVisibility(8);
            }
            boolean zIsAttachedToWindow = fVar.mView.isAttachedToWindow();
            View view = fVar.mView;
            if (zIsAttachedToWindow) {
                WeakHashMap<View, fib> weakHashMap = egb.a;
                view.requestApplyInsets();
            } else {
                view.addOnAttachStateChangeListener(new a(view));
            }
            fVar.performViewCreated();
            this.a.m(fVar, fVar.mView, bundle2, false);
            int visibility = fVar.mView.getVisibility();
            fVar.setPostOnViewCreatedAlpha(fVar.mView.getAlpha());
            if (fVar.mContainer != null && visibility == 0) {
                View viewFindFocus = fVar.mView.findFocus();
                if (viewFindFocus != null) {
                    fVar.setFocusedView(viewFindFocus);
                    if (l.M(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fVar);
                    }
                }
                fVar.mView.setAlpha(0.0f);
            }
        }
        fVar.mState = 2;
    }

    public final void g() {
        f fVarB;
        boolean zM = l.M(3);
        f fVar = this.c;
        if (zM) {
            Log.d("FragmentManager", "movefrom CREATED: " + fVar);
        }
        boolean zIsChangingConfigurations = true;
        int i = 0;
        boolean z = fVar.mRemoving && !fVar.isInBackStack();
        q qVar = this.b;
        if (z && !fVar.mBeingSaved) {
            qVar.i(null, fVar.mWho);
        }
        if (!z) {
            n nVar = qVar.d;
            if (!((nVar.t.containsKey(fVar.mWho) && nVar.w) ? nVar.x : true)) {
                String str = fVar.mTargetWho;
                if (str != null && (fVarB = qVar.b(str)) != null && fVarB.mRetainInstance) {
                    fVar.mTarget = fVarB;
                }
                fVar.mState = 0;
                return;
            }
        }
        ue4<?> ue4Var = fVar.mHost;
        if (ue4Var instanceof whb) {
            zIsChangingConfigurations = qVar.d.x;
        } else {
            g gVar = ue4Var.u;
            if (gVar != null) {
                zIsChangingConfigurations = true ^ gVar.isChangingConfigurations();
            }
        }
        if ((z && !fVar.mBeingSaved) || zIsChangingConfigurations) {
            qVar.d.c(fVar, false);
        }
        fVar.performDestroy();
        this.a.d(fVar, false);
        ArrayList arrayListD = qVar.d();
        int size = arrayListD.size();
        while (i < size) {
            Object obj = arrayListD.get(i);
            i++;
            p pVar = (p) obj;
            if (pVar != null) {
                f fVar2 = pVar.c;
                if (fVar.mWho.equals(fVar2.mTargetWho)) {
                    fVar2.mTarget = fVar;
                    fVar2.mTargetWho = null;
                }
            }
        }
        String str2 = fVar.mTargetWho;
        if (str2 != null) {
            fVar.mTarget = qVar.b(str2);
        }
        qVar.h(this);
    }

    public final void h() {
        View view;
        boolean zM = l.M(3);
        f fVar = this.c;
        if (zM) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fVar);
        }
        ViewGroup viewGroup = fVar.mContainer;
        if (viewGroup != null && (view = fVar.mView) != null) {
            viewGroup.removeView(view);
        }
        fVar.performDestroyView();
        this.a.n(fVar, false);
        fVar.mContainer = null;
        fVar.mView = null;
        fVar.mViewLifecycleOwner = null;
        fVar.mViewLifecycleOwnerLiveData.j(null);
        fVar.mInLayout = false;
    }

    public final void i() {
        boolean zM = l.M(3);
        f fVar = this.c;
        if (zM) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fVar);
        }
        fVar.performDetach();
        this.a.e(fVar, false);
        fVar.mState = -1;
        fVar.mHost = null;
        fVar.mParentFragment = null;
        fVar.mFragmentManager = null;
        if (!fVar.mRemoving || fVar.isInBackStack()) {
            n nVar = this.b.d;
            if (!((nVar.t.containsKey(fVar.mWho) && nVar.w) ? nVar.x : true)) {
                return;
            }
        }
        if (l.M(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fVar);
        }
        fVar.initState();
    }

    public final void j() {
        f fVar = this.c;
        if (fVar.mFromLayout && fVar.mInLayout && !fVar.mPerformedCreateView) {
            if (l.M(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fVar);
            }
            Bundle bundle = fVar.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fVar.performCreateView(fVar.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fVar.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fVar.mView.setTag(R.id.fragment_container_view_tag, fVar);
                if (fVar.mHidden) {
                    fVar.mView.setVisibility(8);
                }
                fVar.performViewCreated();
                this.a.m(fVar, fVar.mView, bundle2, false);
                fVar.mState = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        f fVar = this.c;
        if (z) {
            if (l.M(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iD = d();
                int i = fVar.mState;
                u.c.b bVar = u.c.b.u;
                u.c.b bVar2 = u.c.b.v;
                q qVar = this.b;
                if (iD == i) {
                    if (!z2 && i == -1 && fVar.mRemoving && !fVar.isInBackStack() && !fVar.mBeingSaved) {
                        if (l.M(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fVar);
                        }
                        qVar.d.c(fVar, true);
                        qVar.h(this);
                        if (l.M(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fVar);
                        }
                        fVar.initState();
                    }
                    if (fVar.mHiddenChanged) {
                        if (fVar.mView != null && (viewGroup = fVar.mContainer) != null) {
                            u uVarI = u.i(viewGroup, fVar.getParentFragmentManager());
                            boolean z3 = fVar.mHidden;
                            u.c.a aVar = u.c.a.t;
                            if (z3) {
                                if (l.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fVar);
                                }
                                uVarI.d(bVar2, aVar, this);
                            } else {
                                if (l.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fVar);
                                }
                                uVarI.d(bVar, aVar, this);
                            }
                        }
                        l lVar = fVar.mFragmentManager;
                        if (lVar != null && fVar.mAdded && l.N(fVar)) {
                            lVar.H = true;
                        }
                        fVar.mHiddenChanged = false;
                        fVar.onHiddenChanged(fVar.mHidden);
                        fVar.mChildFragmentManager.p();
                    }
                    this.d = false;
                    return;
                }
                k kVar = this.a;
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fVar.mBeingSaved) {
                                if (qVar.c.get(fVar.mWho) == null) {
                                    qVar.i(n(), fVar.mWho);
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            fVar.mState = 1;
                            break;
                        case 2:
                            fVar.mInLayout = false;
                            fVar.mState = 2;
                            break;
                        case 3:
                            if (l.M(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fVar);
                            }
                            if (fVar.mBeingSaved) {
                                qVar.i(n(), fVar.mWho);
                            } else if (fVar.mView != null && fVar.mSavedViewState == null) {
                                o();
                            }
                            if (fVar.mView != null && (viewGroup2 = fVar.mContainer) != null) {
                                u uVarI2 = u.i(viewGroup2, fVar.getParentFragmentManager());
                                if (l.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fVar);
                                }
                                uVarI2.d(u.c.b.t, u.c.a.v, this);
                            }
                            fVar.mState = 3;
                            break;
                        case 4:
                            if (l.M(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + fVar);
                            }
                            fVar.performStop();
                            kVar.l(fVar, false);
                            break;
                        case 5:
                            fVar.mState = 5;
                            break;
                        case 6:
                            if (l.M(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + fVar);
                            }
                            fVar.performPause();
                            kVar.f(fVar, false);
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fVar.mView != null && (viewGroup3 = fVar.mContainer) != null) {
                                u uVarI3 = u.i(viewGroup3, fVar.getParentFragmentManager());
                                int visibility = fVar.mView.getVisibility();
                                if (visibility != 0) {
                                    if (visibility == 4) {
                                        bVar = u.c.b.w;
                                    } else {
                                        if (visibility != 8) {
                                            throw new IllegalArgumentException("Unknown visibility " + visibility);
                                        }
                                        bVar = bVar2;
                                    }
                                }
                                if (l.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fVar);
                                }
                                uVarI3.d(bVar, u.c.a.u, this);
                            }
                            fVar.mState = 4;
                            break;
                        case 5:
                            if (l.M(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + fVar);
                            }
                            fVar.performStart();
                            kVar.k(fVar, false);
                            break;
                        case 6:
                            fVar.mState = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l(ClassLoader classLoader) {
        f fVar = this.c;
        Bundle bundle = fVar.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fVar.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fVar.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            fVar.mSavedViewState = fVar.mSavedFragmentState.getSparseParcelableArray("viewState");
            fVar.mSavedViewRegistryState = fVar.mSavedFragmentState.getBundle("viewRegistryState");
            o oVar = (o) fVar.mSavedFragmentState.getParcelable("state");
            if (oVar != null) {
                fVar.mTargetWho = oVar.F;
                fVar.mTargetRequestCode = oVar.G;
                Boolean bool = fVar.mSavedUserVisibleHint;
                if (bool != null) {
                    fVar.mUserVisibleHint = bool.booleanValue();
                    fVar.mSavedUserVisibleHint = null;
                } else {
                    fVar.mUserVisibleHint = oVar.H;
                }
            }
            if (fVar.mUserVisibleHint) {
                return;
            }
            fVar.mDeferStart = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fVar, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    public final void m() {
        boolean zRequestFocus;
        String str;
        boolean zM = l.M(3);
        f fVar = this.c;
        if (zM) {
            Log.d("FragmentManager", "moveto RESUMED: " + fVar);
        }
        View focusedView = fVar.getFocusedView();
        if (focusedView != null) {
            if (focusedView == fVar.mView) {
                zRequestFocus = focusedView.requestFocus();
                if (l.M(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(focusedView);
                    sb.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = MetricTracker.Action.FAILED;
                    }
                    sb.append(str);
                    sb.append(" on Fragment ");
                    sb.append(fVar);
                    sb.append(" resulting in focused view ");
                    sb.append(fVar.mView.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == fVar.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                zRequestFocus = focusedView.requestFocus();
                if (l.M(2)) {
                    StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb2.append(focusedView);
                    sb2.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = MetricTracker.Action.FAILED;
                    }
                    sb2.append(str);
                    sb2.append(" on Fragment ");
                    sb2.append(fVar);
                    sb2.append(" resulting in focused view ");
                    sb2.append(fVar.mView.findFocus());
                    Log.v("FragmentManager", sb2.toString());
                }
            }
        }
        fVar.setFocusedView(null);
        fVar.performResume();
        this.a.i(fVar, false);
        this.b.i(null, fVar.mWho);
        fVar.mSavedFragmentState = null;
        fVar.mSavedViewState = null;
        fVar.mSavedViewRegistryState = null;
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        f fVar = this.c;
        if (fVar.mState == -1 && (bundle = fVar.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new o(fVar));
        if (fVar.mState > 0) {
            Bundle bundle3 = new Bundle();
            fVar.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.j(fVar, bundle3, false);
            Bundle bundle4 = new Bundle();
            fVar.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleA0 = fVar.mChildFragmentManager.a0();
            if (!bundleA0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleA0);
            }
            if (fVar.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = fVar.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fVar.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fVar.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void o() {
        f fVar = this.c;
        if (fVar.mView == null) {
            return;
        }
        if (l.M(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fVar + " with view " + fVar.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fVar.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fVar.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fVar.mViewLifecycleOwner.y.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fVar.mSavedViewRegistryState = bundle;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View t;

        public a(View view) {
            this.t = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.t;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, fib> weakHashMap = egb.a;
            view2.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public p(k kVar, q qVar, f fVar) {
        this.a = kVar;
        this.b = qVar;
        this.c = fVar;
    }

    public p(k kVar, q qVar, f fVar, Bundle bundle) {
        this.a = kVar;
        this.b = qVar;
        this.c = fVar;
        fVar.mSavedViewState = null;
        fVar.mSavedViewRegistryState = null;
        fVar.mBackStackNesting = 0;
        fVar.mInLayout = false;
        fVar.mAdded = false;
        f fVar2 = fVar.mTarget;
        fVar.mTargetWho = fVar2 != null ? fVar2.mWho : null;
        fVar.mTarget = null;
        fVar.mSavedFragmentState = bundle;
        fVar.mArguments = bundle.getBundle("arguments");
    }
}
