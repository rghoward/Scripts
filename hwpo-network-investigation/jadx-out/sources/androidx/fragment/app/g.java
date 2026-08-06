package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import defpackage.az7;
import defpackage.b19;
import defpackage.ba;
import defpackage.bf4;
import defpackage.bh7;
import defpackage.c9;
import defpackage.cs6;
import defpackage.df4;
import defpackage.dq1;
import defpackage.f19;
import defpackage.gh7;
import defpackage.hi7;
import defpackage.ih7;
import defpackage.ja;
import defpackage.jr6;
import defpackage.me4;
import defpackage.n76;
import defpackage.rh7;
import defpackage.s66;
import defpackage.sh7;
import defpackage.sy1;
import defpackage.ue4;
import defpackage.vhb;
import defpackage.whb;
import defpackage.yl9;
import defpackage.z07;
import defpackage.zb6;
import defpackage.zg7;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class g extends dq1 implements c9.a {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final n76 mFragmentLifecycleRegistry;
    final me4 mFragments;
    boolean mResumed;
    boolean mStopped;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends ue4<g> implements gh7, hi7, rh7, sh7, whb, bh7, ja, f19, df4, jr6 {
        public a() {
            super(g.this);
        }

        @Override // defpackage.df4
        public final void a(f fVar) {
            g.this.onAttachFragment(fVar);
        }

        @Override // defpackage.jr6
        public final void addMenuProvider(cs6 cs6Var) {
            g.this.addMenuProvider(cs6Var);
        }

        @Override // defpackage.gh7
        public final void addOnConfigurationChangedListener(sy1<Configuration> sy1Var) {
            g.this.addOnConfigurationChangedListener(sy1Var);
        }

        @Override // defpackage.rh7
        public final void addOnMultiWindowModeChangedListener(sy1<z07> sy1Var) {
            g.this.addOnMultiWindowModeChangedListener(sy1Var);
        }

        @Override // defpackage.sh7
        public final void addOnPictureInPictureModeChangedListener(sy1<az7> sy1Var) {
            g.this.addOnPictureInPictureModeChangedListener(sy1Var);
        }

        @Override // defpackage.hi7
        public final void addOnTrimMemoryListener(sy1<Integer> sy1Var) {
            g.this.addOnTrimMemoryListener(sy1Var);
        }

        @Override // defpackage.le4
        public final View b(int i) {
            return g.this.findViewById(i);
        }

        @Override // defpackage.le4
        public final boolean c() {
            Window window = g.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // defpackage.ue4
        public final void d(PrintWriter printWriter, String[] strArr) {
            g.this.dump("  ", null, printWriter, strArr);
        }

        @Override // defpackage.ue4
        public final g e() {
            return g.this;
        }

        @Override // defpackage.ue4
        public final LayoutInflater f() {
            g gVar = g.this;
            return gVar.getLayoutInflater().cloneInContext(gVar);
        }

        @Override // defpackage.ue4
        public final boolean g(String str) {
            return c9.f(g.this, str);
        }

        @Override // defpackage.ja
        public final ba getActivityResultRegistry() {
            return g.this.getActivityResultRegistry();
        }

        @Override // defpackage.m76
        public final s66 getLifecycle() {
            return g.this.mFragmentLifecycleRegistry;
        }

        @Override // defpackage.bh7
        public final zg7 getOnBackPressedDispatcher() {
            return g.this.getOnBackPressedDispatcher();
        }

        @Override // defpackage.f19
        public final b19 getSavedStateRegistry() {
            return g.this.getSavedStateRegistry();
        }

        @Override // defpackage.whb
        public final vhb getViewModelStore() {
            return g.this.getViewModelStore();
        }

        @Override // defpackage.ue4
        public final void h() {
            g.this.invalidateMenu();
        }

        @Override // defpackage.jr6
        public final void removeMenuProvider(cs6 cs6Var) {
            g.this.removeMenuProvider(cs6Var);
        }

        @Override // defpackage.gh7
        public final void removeOnConfigurationChangedListener(sy1<Configuration> sy1Var) {
            g.this.removeOnConfigurationChangedListener(sy1Var);
        }

        @Override // defpackage.rh7
        public final void removeOnMultiWindowModeChangedListener(sy1<z07> sy1Var) {
            g.this.removeOnMultiWindowModeChangedListener(sy1Var);
        }

        @Override // defpackage.sh7
        public final void removeOnPictureInPictureModeChangedListener(sy1<az7> sy1Var) {
            g.this.removeOnPictureInPictureModeChangedListener(sy1Var);
        }

        @Override // defpackage.hi7
        public final void removeOnTrimMemoryListener(sy1<Integer> sy1Var) {
            g.this.removeOnTrimMemoryListener(sy1Var);
        }
    }

    public g() {
        this.mFragments = new me4(new a());
        this.mFragmentLifecycleRegistry = new n76(this, true);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new b19.b() { // from class: ae4
            @Override // b19.b
            public final Bundle a() {
                return this.a.lambda$init$0();
            }
        });
        addOnConfigurationChangedListener(new sy1() { // from class: be4
            @Override // defpackage.sy1
            public final void accept(Object obj) {
                this.a.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new sy1() { // from class: ce4
            @Override // defpackage.sy1
            public final void accept(Object obj) {
                this.a.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new ih7() { // from class: de4
            @Override // defpackage.ih7
            public final void a(dq1 dq1Var) {
                this.a.lambda$init$3(dq1Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.f(s66.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        a aVar = this.mFragments.a;
        aVar.w.b(aVar, aVar, null);
    }

    private static boolean markState(l lVar, s66.b bVar) {
        boolean zMarkState = false;
        for (f fVar : lVar.c.f()) {
            if (fVar != null) {
                if (fVar.getHost() != null) {
                    zMarkState |= markState(fVar.getChildFragmentManager(), bVar);
                }
                s sVar = fVar.mViewLifecycleOwner;
                s66.b bVar2 = s66.b.w;
                if (sVar != null) {
                    sVar.b();
                    if (sVar.x.d.a(bVar2)) {
                        fVar.mViewLifecycleOwner.x.h(bVar);
                        zMarkState = true;
                    }
                }
                if (fVar.mLifecycleRegistry.d.a(bVar2)) {
                    fVar.mLifecycleRegistry.h(bVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.a.w.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                zb6.a(this).b(str2, printWriter);
            }
            this.mFragments.a.w.w(str, fileDescriptor, printWriter, strArr);
        }
    }

    public l getSupportFragmentManager() {
        return this.mFragments.a.w;
    }

    @Deprecated
    public zb6 getSupportLoaderManager() {
        return zb6.a(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), s66.b.v)) {
        }
    }

    @Override // defpackage.dq1, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.dq1, defpackage.hq1, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(s66.a.ON_CREATE);
        bf4 bf4Var = this.mFragments.a.w;
        bf4Var.I = false;
        bf4Var.J = false;
        bf4Var.P.y = false;
        bf4Var.v(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.w.m();
        this.mFragmentLifecycleRegistry.f(s66.a.ON_DESTROY);
    }

    @Override // defpackage.dq1, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.a.w.k(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.w.v(5);
        this.mFragmentLifecycleRegistry.f(s66.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // defpackage.dq1, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.w.A(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(s66.a.ON_RESUME);
        bf4 bf4Var = this.mFragments.a.w;
        bf4Var.I = false;
        bf4Var.J = false;
        bf4Var.P.y = false;
        bf4Var.v(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            bf4 bf4Var = this.mFragments.a.w;
            bf4Var.I = false;
            bf4Var.J = false;
            bf4Var.P.y = false;
            bf4Var.v(4);
        }
        this.mFragments.a.w.A(true);
        this.mFragmentLifecycleRegistry.f(s66.a.ON_START);
        bf4 bf4Var2 = this.mFragments.a.w;
        bf4Var2.I = false;
        bf4Var2.J = false;
        bf4Var2.P.y = false;
        bf4Var2.v(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        bf4 bf4Var = this.mFragments.a.w;
        bf4Var.J = true;
        bf4Var.P.y = true;
        bf4Var.v(4);
        this.mFragmentLifecycleRegistry.f(s66.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(yl9 yl9Var) {
        setEnterSharedElementCallback(yl9Var != null ? new c9.b(yl9Var) : null);
    }

    public void setExitSharedElementCallback(yl9 yl9Var) {
        setExitSharedElementCallback(yl9Var != null ? new c9.b(yl9Var) : null);
    }

    public void startActivityFromFragment(f fVar, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fVar.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(f fVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fVar.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    public void startActivityFromFragment(f fVar, Intent intent, int i) {
        startActivityFromFragment(fVar, intent, i, (Bundle) null);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Deprecated
    public void onAttachFragment(f fVar) {
    }

    @Override // c9.a
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public g(int i) {
        super(i);
        this.mFragments = new me4(new a());
        this.mFragmentLifecycleRegistry = new n76(this, true);
        this.mStopped = true;
        init();
    }
}
