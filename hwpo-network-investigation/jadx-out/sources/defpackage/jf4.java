package defpackage;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.f;
import androidx.fragment.app.l;
import androidx.fragment.app.r;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class jf4 extends qp7 {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private r mCurTransaction;
    private f mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final l mFragmentManager;

    public jf4(l lVar, int i) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = lVar;
        this.mBehavior = i;
    }

    private static String makeFragmentName(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // defpackage.qp7
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        f fVar = (f) obj;
        if (this.mCurTransaction == null) {
            l lVar = this.mFragmentManager;
            lVar.getClass();
            this.mCurTransaction = new a(lVar);
        }
        this.mCurTransaction.c(fVar);
        if (fVar.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // defpackage.qp7
    public void finishUpdate(ViewGroup viewGroup) {
        r rVar = this.mCurTransaction;
        if (rVar != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    a aVar = (a) rVar;
                    if (aVar.g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    aVar.h = false;
                    aVar.r.B(aVar, true);
                    this.mExecutingFinishUpdate = false;
                } catch (Throwable th) {
                    this.mExecutingFinishUpdate = false;
                    throw th;
                }
            }
            this.mCurTransaction = null;
        }
    }

    public abstract f getItem(int i);

    public long getItemId(int i) {
        return i;
    }

    @Override // defpackage.qp7
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.mCurTransaction == null) {
            l lVar = this.mFragmentManager;
            lVar.getClass();
            this.mCurTransaction = new a(lVar);
        }
        long itemId = getItemId(i);
        f fVarE = this.mFragmentManager.E(makeFragmentName(viewGroup.getId(), itemId));
        if (fVarE != null) {
            r rVar = this.mCurTransaction;
            rVar.getClass();
            rVar.b(new r.a(fVarE, 7));
        } else {
            fVarE = getItem(i);
            this.mCurTransaction.d(viewGroup.getId(), fVarE, makeFragmentName(viewGroup.getId(), itemId), 1);
        }
        if (fVarE != this.mCurrentPrimaryItem) {
            fVarE.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.e(fVarE, s66.b.w);
                return fVarE;
            }
            fVarE.setUserVisibleHint(false);
        }
        return fVarE;
    }

    @Override // defpackage.qp7
    public boolean isViewFromObject(View view, Object obj) {
        return ((f) obj).getView() == view;
    }

    @Override // defpackage.qp7
    public Parcelable saveState() {
        return null;
    }

    @Override // defpackage.qp7
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        f fVar = (f) obj;
        f fVar2 = this.mCurrentPrimaryItem;
        if (fVar != fVar2) {
            if (fVar2 != null) {
                fVar2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        l lVar = this.mFragmentManager;
                        lVar.getClass();
                        this.mCurTransaction = new a(lVar);
                    }
                    this.mCurTransaction.e(this.mCurrentPrimaryItem, s66.b.w);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fVar.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    l lVar2 = this.mFragmentManager;
                    lVar2.getClass();
                    this.mCurTransaction = new a(lVar2);
                }
                this.mCurTransaction.e(fVar, s66.b.x);
            } else {
                fVar.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fVar;
        }
    }

    @Override // defpackage.qp7
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        sp2.b(this, " requires a view id", "ViewPager with adapter ");
    }

    @Deprecated
    public jf4(l lVar) {
        this(lVar, 0);
    }

    @Override // defpackage.qp7
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }
}
