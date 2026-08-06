package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.hwpo_training_app.R;
import defpackage.aa0;
import defpackage.ac6;
import defpackage.al;
import defpackage.b19;
import defpackage.ba;
import defpackage.bf4;
import defpackage.c19;
import defpackage.df4;
import defpackage.dk9;
import defpackage.e19;
import defpackage.el4;
import defpackage.f19;
import defpackage.fg4;
import defpackage.fk9;
import defpackage.fx9;
import defpackage.g19;
import defpackage.g76;
import defpackage.gk9;
import defpackage.i5a;
import defpackage.ja;
import defpackage.k27;
import defpackage.kb6;
import defpackage.lb2;
import defpackage.le4;
import defpackage.li4;
import defpackage.m76;
import defpackage.ml4;
import defpackage.n76;
import defpackage.n9;
import defpackage.nl4;
import defpackage.o9;
import defpackage.og5;
import defpackage.s66;
import defpackage.s97;
import defpackage.sk0;
import defpackage.thb;
import defpackage.ue4;
import defpackage.vhb;
import defpackage.w9;
import defpackage.whb;
import defpackage.wt4;
import defpackage.x09;
import defpackage.xr1;
import defpackage.yd4;
import defpackage.yl9;
import defpackage.z17;
import defpackage.z90;
import defpackage.zb6;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class f implements ComponentCallbacks, View.OnCreateContextMenuListener, m76, whb, wt4, f19 {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    androidx.fragment.app.l mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    thb.c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    androidx.fragment.app.l mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    ue4<?> mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    n76 mLifecycleRegistry;
    s66.b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<m> mOnPreAttachedListeners;
    f mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final m mSavedStateAttachListener;
    c19 mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    f mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    s mViewLifecycleOwner;
    k27<m76> mViewLifecycleOwnerLiveData;
    String mWho;

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a<I> extends w9<I> {
        public final /* synthetic */ AtomicReference a;

        public a(AtomicReference atomicReference) {
            this.a = atomicReference;
        }

        @Override // defpackage.w9
        public final void a(Object obj) {
            w9 w9Var = (w9) this.a.get();
            if (w9Var != null) {
                w9Var.a(obj);
            } else {
                aa0.c("Operation cannot be started before fragment is in created state");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.this.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c extends m {
        public c() {
        }

        @Override // androidx.fragment.app.f.m
        public final void a() {
            f fVar = f.this;
            fVar.mSavedStateRegistryController.a();
            x09.b(fVar);
            Bundle bundle = fVar.mSavedFragmentState;
            fVar.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.this.callStartTransitionListener(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e implements Runnable {
        public final /* synthetic */ u t;

        public e(u uVar) {
            this.t = uVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            u uVar = this.t;
            if (uVar.b.isEmpty()) {
                return;
            }
            uVar.e();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class C0019f extends le4 {
        public C0019f() {
        }

        @Override // defpackage.le4
        public final View b(int i) {
            f fVar = f.this;
            View view = fVar.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            aa0.c(xr1.b("Fragment ", fVar, " does not have a view"));
            return null;
        }

        @Override // defpackage.le4
        public final boolean c() {
            return f.this.mView != null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class g implements g76 {
        public g() {
        }

        @Override // defpackage.g76
        public final void t(m76 m76Var, s66.a aVar) {
            View view;
            if (aVar != s66.a.ON_STOP || (view = f.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class h implements li4<Void, ba> {
        public h() {
        }

        @Override // defpackage.li4
        public final ba apply() {
            f fVar = f.this;
            Object obj = fVar.mHost;
            return obj instanceof ja ? ((ja) obj).getActivityResultRegistry() : fVar.requireActivity().getActivityResultRegistry();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class i implements li4<Void, ba> {
        public final /* synthetic */ ba a;

        public i(ba baVar) {
            this.a = baVar;
        }

        @Override // defpackage.li4
        public final ba apply() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class j extends m {
        public final /* synthetic */ li4 a;
        public final /* synthetic */ AtomicReference b;
        public final /* synthetic */ o9 c;
        public final /* synthetic */ n9 d;

        public j(li4 li4Var, AtomicReference atomicReference, o9 o9Var, n9 n9Var) {
            this.a = li4Var;
            this.b = atomicReference;
            this.c = o9Var;
            this.d = n9Var;
        }

        @Override // androidx.fragment.app.f.m
        public final void a() {
            f fVar = f.this;
            this.b.set(this.a.apply().c(fVar.generateActivityResultKey(), fVar, this.c, this.d));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class k {
        public boolean a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public ArrayList<String> g;
        public ArrayList<String> h;
        public Object i;
        public Object j;
        public Object k;
        public Object l;
        public Object m;
        public Object n;
        public Boolean o;
        public Boolean p;
        public yl9 q;
        public yl9 r;
        public float s;
        public View t;
        public boolean u;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class l extends RuntimeException {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class m {
        public abstract void a();
    }

    public f() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new bf4();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = s66.b.x;
        this.mViewLifecycleOwnerLiveData = new k27<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        initLifecycle();
    }

    private k ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            k kVar = new k();
            kVar.i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            kVar.j = obj;
            kVar.k = null;
            kVar.l = obj;
            kVar.m = null;
            kVar.n = obj;
            kVar.q = null;
            kVar.r = null;
            kVar.s = 1.0f;
            kVar.t = null;
            this.mAnimationInfo = kVar;
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        s66.b bVar = this.mMaxState;
        return (bVar == s66.b.u || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private f getTargetFragment(boolean z) {
        String str;
        if (z) {
            fg4.a aVar = fg4.a;
            fg4.b(new nl4(this, "Attempting to get target fragment from fragment " + this));
            fg4.a(this).getClass();
        }
        f fVar = this.mTarget;
        if (fVar != null) {
            return fVar;
        }
        androidx.fragment.app.l lVar = this.mFragmentManager;
        if (lVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return lVar.c.b(str);
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new n76(this, true);
        this.mSavedStateRegistryController = new c19(new e19(this, new s97(1, this)));
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @Deprecated
    public static f instantiate(Context context, String str, Bundle bundle) {
        try {
            f fVarNewInstance = androidx.fragment.app.i.c(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return fVarNewInstance;
            }
            bundle.setClassLoader(fVarNewInstance.getClass().getClassLoader());
            fVarNewInstance.setArguments(bundle);
            return fVarNewInstance;
        } catch (IllegalAccessException e2) {
            throw new l(sk0.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new l(sk0.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new l(sk0.c("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new l(sk0.c("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performCreateView$0() {
        s sVar = this.mViewLifecycleOwner;
        sVar.y.b(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    private <I, O> w9<I> prepareCallInternal(o9<I, O> o9Var, li4<Void, ba> li4Var, n9<O> n9Var) {
        if (this.mState > 1) {
            aa0.c(xr1.b("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new j(li4Var, atomicReference, o9Var, n9Var));
        return new a(atomicReference);
    }

    private void registerOnPreAttachListener(m mVar) {
        if (this.mState >= 0) {
            mVar.a();
        } else {
            this.mOnPreAttachedListeners.add(mVar);
        }
    }

    private void restoreViewState() {
        if (androidx.fragment.app.l.M(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        androidx.fragment.app.l lVar;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (lVar = this.mFragmentManager) == null) {
            return;
        }
        u uVarI = u.i(viewGroup, lVar);
        uVarI.k();
        if (z) {
            this.mHost.v.post(new e(uVarI));
        } else {
            uVarI.e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public le4 createFragmentContainer() {
        return new C0019f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        f targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            zb6.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.w(al.d(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public f findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final androidx.fragment.app.g getActivity() {
        ue4<?> ue4Var = this.mHost;
        if (ue4Var == null) {
            return null;
        }
        return ue4Var.t;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final androidx.fragment.app.l getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        aa0.c(xr1.b("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public Context getContext() {
        ue4<?> ue4Var = this.mHost;
        if (ue4Var == null) {
            return null;
        }
        return ue4Var.u;
    }

    @Override // defpackage.wt4
    public lb2 getDefaultViewModelCreationExtras() {
        Object obj;
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            obj = null;
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && androidx.fragment.app.l.M(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        z17 z17Var = new z17(obj);
        LinkedHashMap linkedHashMap = z17Var.a;
        if (application != null) {
            linkedHashMap.put(thb.a.d, application);
        }
        linkedHashMap.put(x09.a, this);
        linkedHashMap.put(x09.b, this);
        if (getArguments() != null) {
            linkedHashMap.put(x09.c, getArguments());
        }
        return z17Var;
    }

    @Override // defpackage.wt4
    public thb.c getDefaultViewModelProviderFactory() {
        Application application = null;
        if (this.mFragmentManager == null) {
            aa0.c("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.mDefaultFactory == null) {
            for (Context applicationContext = requireContext().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
            }
            if (application == null && androidx.fragment.app.l.M(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new g19(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.b;
    }

    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.i;
    }

    public yl9 getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.q;
    }

    public int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.c;
    }

    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.k;
    }

    public yl9 getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.r;
    }

    public View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.t;
    }

    @Deprecated
    public final androidx.fragment.app.l getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        ue4<?> ue4Var = this.mHost;
        if (ue4Var == null) {
            return null;
        }
        return ue4Var.e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        ue4<?> ue4Var = this.mHost;
        if (ue4Var == null) {
            aa0.c("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        LayoutInflater layoutInflaterF = ue4Var.f();
        layoutInflaterF.setFactory2(this.mChildFragmentManager.f);
        return layoutInflaterF;
    }

    @Override // defpackage.m76
    public s66 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public zb6 getLoaderManager() {
        return zb6.a(this);
    }

    public int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f;
    }

    public final f getParentFragment() {
        return this.mParentFragment;
    }

    public final androidx.fragment.app.l getParentFragmentManager() {
        androidx.fragment.app.l lVar = this.mFragmentManager;
        if (lVar != null) {
            return lVar;
        }
        aa0.c(xr1.b("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.a;
    }

    public int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.d;
    }

    public int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.e;
    }

    public float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.s;
    }

    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        fg4.a aVar = fg4.a;
        fg4.b(new el4(this, "Attempting to get retain instance for fragment " + this));
        fg4.a(this).getClass();
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // defpackage.f19
    public final b19 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }

    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.m;
    }

    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i2) {
        return getResources().getString(i2);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final int getTargetRequestCode() {
        fg4.a aVar = fg4.a;
        fg4.b(new ml4(this, "Attempting to get target request code from fragment " + this));
        fg4.a(this).getClass();
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i2) {
        return getResources().getText(i2);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public m76 getViewLifecycleOwner() {
        s sVar = this.mViewLifecycleOwner;
        if (sVar != null) {
            return sVar;
        }
        aa0.c(xr1.b("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    public kb6<m76> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // defpackage.whb
    public vhb getViewModelStore() {
        if (this.mFragmentManager == null) {
            aa0.c("Can't access ViewModels from detached fragment");
            return null;
        }
        if (getMinimumMaxLifecycleState() == 1) {
            aa0.c("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap<String, vhb> map = this.mFragmentManager.P.v;
        vhb vhbVar = map.get(this.mWho);
        if (vhbVar != null) {
            return vhbVar;
        }
        vhb vhbVar2 = new vhb();
        map.put(this.mWho, vhbVar2);
        return vhbVar2;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new bf4();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        androidx.fragment.app.l lVar = this.mFragmentManager;
        if (lVar != null) {
            f fVar = this.mParentFragment;
            lVar.getClass();
            if (fVar == null ? false : fVar.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            f fVar = this.mParentFragment;
            if (!(fVar == null ? true : fVar.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        androidx.fragment.app.l lVar = this.mFragmentManager;
        if (lVar == null) {
            return false;
        }
        return lVar.Q();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.S();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (androidx.fragment.app.l.M(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        ue4<?> ue4Var = this.mHost;
        androidx.fragment.app.g gVar = ue4Var == null ? null : ue4Var.t;
        if (gVar != null) {
            this.mCalled = false;
            onAttach((Activity) gVar);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        androidx.fragment.app.l lVar = this.mChildFragmentManager;
        if (lVar.w >= 1) {
            return;
        }
        lVar.I = false;
        lVar.J = false;
        lVar.P.y = false;
        lVar.v(1);
    }

    public Animation onCreateAnimation(int i2, boolean z, int i3) {
        return null;
    }

    public Animator onCreateAnimator(int i2, boolean z, int i3) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        ue4<?> ue4Var = this.mHost;
        androidx.fragment.app.g gVar = ue4Var == null ? null : ue4Var.t;
        if (gVar != null) {
            this.mCalled = false;
            onInflate((Activity) gVar, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.S();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new i5a(xr1.b("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        androidx.fragment.app.l lVar = this.mChildFragmentManager;
        lVar.I = false;
        lVar.J = false;
        lVar.P.y = false;
        lVar.v(4);
    }

    public void performAttach() {
        ArrayList<m> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            m mVar = arrayList.get(i2);
            i2++;
            mVar.a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.u);
        if (!this.mCalled) {
            throw new i5a(xr1.b("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator<df4> it = this.mFragmentManager.q.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        androidx.fragment.app.l lVar = this.mChildFragmentManager;
        lVar.I = false;
        lVar.J = false;
        lVar.P.y = false;
        lVar.v(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.k(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.S();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new i5a(xr1.b("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.f(s66.a.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return this.mChildFragmentManager.l(menu, menuInflater) | z;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.S();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new s(this, getViewModelStore(), new yd4(this));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        s sVar = this.mViewLifecycleOwner;
        if (viewOnCreateView == null) {
            if (sVar.x == null) {
                this.mViewLifecycleOwner = null;
                return;
            } else {
                aa0.c("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        sVar.b();
        if (androidx.fragment.app.l.M(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        View view = this.mView;
        s sVar2 = this.mViewLifecycleOwner;
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, sVar2);
        View view2 = this.mView;
        s sVar3 = this.mViewLifecycleOwner;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, sVar3);
        View view3 = this.mView;
        s sVar4 = this.mViewLifecycleOwner;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, sVar4);
        this.mViewLifecycleOwnerLiveData.j(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.m();
        this.mLifecycleRegistry.f(s66.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new i5a(xr1.b("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.v(1);
        if (this.mView != null) {
            s sVar = this.mViewLifecycleOwner;
            sVar.b();
            if (sVar.x.d.compareTo(s66.b.v) >= 0) {
                this.mViewLifecycleOwner.a(s66.a.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new i5a(xr1.b("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        fx9<ac6.a> fx9Var = zb6.a(this).b.t;
        int iF = fx9Var.f();
        for (int i2 = 0; i2 < iF; i2++) {
            fx9Var.g(i2).getClass();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new i5a(xr1.b("Fragment ", this, " did not call through to super.onDetach()"));
        }
        androidx.fragment.app.l lVar = this.mChildFragmentManager;
        if (lVar.K) {
            return;
        }
        lVar.m();
        this.mChildFragmentManager = new bf4();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.q(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.r(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.v(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(s66.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(s66.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new i5a(xr1.b("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return this.mChildFragmentManager.u(menu) | z;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zP = androidx.fragment.app.l.P(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zP) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zP);
            onPrimaryNavigationFragmentChanged(zP);
            androidx.fragment.app.l lVar = this.mChildFragmentManager;
            lVar.m0();
            lVar.s(lVar.A);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.S();
        this.mChildFragmentManager.A(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new i5a(xr1.b("Fragment ", this, " did not call through to super.onResume()"));
        }
        n76 n76Var = this.mLifecycleRegistry;
        s66.a aVar = s66.a.ON_RESUME;
        n76Var.f(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.x.f(aVar);
        }
        androidx.fragment.app.l lVar = this.mChildFragmentManager;
        lVar.I = false;
        lVar.J = false;
        lVar.P.y = false;
        lVar.v(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.S();
        this.mChildFragmentManager.A(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new i5a(xr1.b("Fragment ", this, " did not call through to super.onStart()"));
        }
        n76 n76Var = this.mLifecycleRegistry;
        s66.a aVar = s66.a.ON_START;
        n76Var.f(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.x.f(aVar);
        }
        androidx.fragment.app.l lVar = this.mChildFragmentManager;
        lVar.I = false;
        lVar.J = false;
        lVar.P.y = false;
        lVar.v(5);
    }

    public void performStop() {
        androidx.fragment.app.l lVar = this.mChildFragmentManager;
        lVar.J = true;
        lVar.P.y = true;
        lVar.v(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(s66.a.ON_STOP);
        }
        this.mLifecycleRegistry.f(s66.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new i5a(xr1.b("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.v(2);
    }

    public final void postponeEnterTransition(long j2, TimeUnit timeUnit) {
        ensureAnimationInfo().u = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        androidx.fragment.app.l lVar = this.mFragmentManager;
        if (lVar != null) {
            this.mPostponedHandler = lVar.x.v;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j2));
    }

    public final <I, O> w9<I> registerForActivityResult(o9<I, O> o9Var, n9<O> n9Var) {
        return prepareCallInternal(o9Var, new h(), n9Var);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i2) {
        if (this.mHost == null) {
            aa0.c(xr1.b("Fragment ", this, " not attached to Activity"));
            return;
        }
        androidx.fragment.app.l parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.F == null) {
            parentFragmentManager.x.getClass();
            strArr.getClass();
        } else {
            parentFragmentManager.G.addLast(new androidx.fragment.app.l.n(this.mWho, i2));
            parentFragmentManager.F.a(strArr);
        }
    }

    public final androidx.fragment.app.g requireActivity() {
        androidx.fragment.app.g activity = getActivity();
        if (activity != null) {
            return activity;
        }
        aa0.c(xr1.b("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        aa0.c(xr1.b("Fragment ", this, " does not have any arguments."));
        return null;
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        aa0.c(xr1.b("Fragment ", this, " not attached to a context."));
        return null;
    }

    @Deprecated
    public final androidx.fragment.app.l requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        aa0.c(xr1.b("Fragment ", this, " not attached to a host."));
        return null;
    }

    public final f requireParentFragment() {
        f parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            aa0.c(xr1.b("Fragment ", this, " is not attached to any Fragment or host"));
            return null;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        Context context = getContext();
        sb.append(" is not a child Fragment, it is directly attached to ");
        sb.append(context);
        throw new IllegalStateException(sb.toString());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        aa0.c(xr1.b("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.Z(bundle);
        androidx.fragment.app.l lVar = this.mChildFragmentManager;
        lVar.I = false;
        lVar.J = false;
        lVar.P.y = false;
        lVar.v(1);
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().o = Boolean.valueOf(z);
    }

    public void setAnimations(int i2, int i3, int i4, int i5) {
        if (this.mAnimationInfo == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        ensureAnimationInfo().b = i2;
        ensureAnimationInfo().c = i3;
        ensureAnimationInfo().d = i4;
        ensureAnimationInfo().e = i5;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
        } else {
            aa0.c("Fragment already added and state has been saved");
        }
    }

    public void setEnterSharedElementCallback(yl9 yl9Var) {
        ensureAnimationInfo().q = yl9Var;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().i = obj;
    }

    public void setExitSharedElementCallback(yl9 yl9Var) {
        ensureAnimationInfo().r = yl9Var;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.h();
        }
    }

    public void setInitialSavedState(n nVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            aa0.c("Fragment already added");
            return;
        }
        if (nVar == null || (bundle = nVar.t) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.h();
            }
        }
    }

    public void setNextTransition(int i2) {
        if (this.mAnimationInfo == null && i2 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f = i2;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().a = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().s = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        fg4.a aVar = fg4.a;
        fg4.b(new dk9(this, "Attempting to set retain instance for fragment " + this));
        fg4.a(this).getClass();
        this.mRetainInstance = z;
        androidx.fragment.app.l lVar = this.mFragmentManager;
        if (lVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
            return;
        }
        androidx.fragment.app.n nVar = lVar.P;
        if (z) {
            nVar.b(this);
        } else {
            nVar.f(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        k kVar = this.mAnimationInfo;
        kVar.g = arrayList;
        kVar.h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().n = obj;
    }

    @Deprecated
    public void setTargetFragment(f fVar, int i2) {
        if (fVar != null) {
            fg4.a aVar = fg4.a;
            fg4.b(new fk9(this, "Attempting to set target fragment " + fVar + " with request code " + i2 + " for fragment " + this));
            fg4.a(this).getClass();
        }
        androidx.fragment.app.l lVar = this.mFragmentManager;
        androidx.fragment.app.l lVar2 = fVar != null ? fVar.mFragmentManager : null;
        if (lVar != null && lVar2 != null && lVar != lVar2) {
            z90.a(xr1.b("Fragment ", fVar, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (f targetFragment = fVar; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + fVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fVar == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fVar.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fVar;
        } else {
            this.mTargetWho = fVar.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i2;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        fg4.a aVar = fg4.a;
        fg4.b(new gk9(this, "Attempting to set user visible hint to " + z + " for fragment " + this));
        fg4.a(this).getClass();
        boolean z2 = false;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            androidx.fragment.app.l lVar = this.mFragmentManager;
            p pVarH = lVar.h(this);
            f fVar = pVarH.c;
            if (fVar.mDeferStart) {
                if (lVar.b) {
                    lVar.L = true;
                } else {
                    fVar.mDeferStart = false;
                    pVarH.k();
                }
            }
        }
        this.mUserVisibleHint = z;
        if (this.mState < 5 && !z) {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        ue4<?> ue4Var = this.mHost;
        if (ue4Var != null) {
            return ue4Var.g(str);
        }
        return false;
    }

    public void startActivity(Intent intent, Bundle bundle) {
        ue4<?> ue4Var = this.mHost;
        if (ue4Var == null) {
            aa0.c(xr1.b("Fragment ", this, " not attached to Activity"));
        } else {
            intent.getClass();
            ue4Var.u.startActivity(intent, bundle);
        }
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        if (this.mHost == null) {
            aa0.c(xr1.b("Fragment ", this, " not attached to Activity"));
            return;
        }
        androidx.fragment.app.l parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.D != null) {
            parentFragmentManager.G.addLast(new androidx.fragment.app.l.n(this.mWho, i2));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.D.a(intent);
            return;
        }
        ue4<?> ue4Var = parentFragmentManager.x;
        ue4Var.getClass();
        intent.getClass();
        if (i2 == -1) {
            ue4Var.u.startActivity(intent, bundle);
        } else {
            aa0.c("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (this.mHost == null) {
            aa0.c(xr1.b("Fragment ", this, " not attached to Activity"));
            return;
        }
        if (androidx.fragment.app.l.M(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i2 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        androidx.fragment.app.l parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.E == null) {
            ue4<?> ue4Var = parentFragmentManager.x;
            ue4Var.getClass();
            intentSender.getClass();
            if (i2 != -1) {
                aa0.c("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
            androidx.fragment.app.g gVar = ue4Var.t;
            if (gVar != null) {
                gVar.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
                return;
            } else {
                aa0.c("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (androidx.fragment.app.l.M(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + this);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        intentSender.getClass();
        og5 og5Var = new og5(intentSender, intent, i3, i4);
        parentFragmentManager.G.addLast(new androidx.fragment.app.l.n(this.mWho, i2));
        if (androidx.fragment.app.l.M(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.E.a(og5Var);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().u = false;
        } else if (Looper.myLooper() != this.mHost.v.getLooper()) {
            this.mHost.v.postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();
        public final Bundle t;

        public n(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.t = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.t);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Parcelable.ClassLoaderCreator<n> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new n(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new n[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }
        }

        public n(Bundle bundle) {
            this.t = bundle;
        }
    }

    public final String getString(int i2, Object... objArr) {
        return getResources().getString(i2, objArr);
    }

    public final <I, O> w9<I> registerForActivityResult(o9<I, O> o9Var, ba baVar, n9<O> n9Var) {
        return prepareCallInternal(o9Var, new i(baVar), n9Var);
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Deprecated
    public void onAttachFragment(f fVar) {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(s66.a.ON_CREATE);
                return;
            }
            return;
        }
        throw new i5a(xr1.b("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    @Deprecated
    public final f getTargetFragment() {
        return getTargetFragment(true);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().u = true;
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2) {
        startActivityForResult(intent, i2, null);
    }

    public f(int i2) {
        this();
        this.mContentLayoutId = i2;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    @Deprecated
    public static f instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }
}
