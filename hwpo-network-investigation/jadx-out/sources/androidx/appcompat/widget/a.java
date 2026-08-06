package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import com.hwpo_training_app.R;
import defpackage.aa0;
import defpackage.ao9;
import defpackage.pd4;
import defpackage.pqa;
import defpackage.v8;
import defpackage.yr6;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends androidx.appcompat.view.menu.a {
    public d C;
    public Drawable D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public final SparseBooleanArray L;
    public e M;
    public C0005a N;
    public c O;
    public b P;
    public final f Q;
    public int R;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class C0005a extends i {
        public C0005a(Context context, m mVar, View view) {
            super(context, mVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if ((mVar.A.x & 32) != 32) {
                View view2 = a.this.C;
                this.e = view2 == null ? (View) a.this.A : view2;
            }
            f fVar = a.this.Q;
            this.h = fVar;
            yr6 yr6Var = this.i;
            if (yr6Var != null) {
                yr6Var.f(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            a aVar = a.this;
            aVar.N = null;
            aVar.R = 0;
            super.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c implements Runnable {
        public final e t;

        public c(e eVar) {
            this.t = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.view.menu.f.a aVar;
            a aVar2 = a.this;
            androidx.appcompat.view.menu.f fVar = aVar2.v;
            if (fVar != null && (aVar = fVar.e) != null) {
                aVar.b(fVar);
            }
            View view = (View) aVar2.A;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.t;
                if (eVar.b()) {
                    aVar2.M = eVar;
                } else if (eVar.e != null) {
                    eVar.d(0, 0, false, false);
                    aVar2.M = eVar;
                }
            }
            aVar2.O = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class C0006a extends pd4 {
            public C0006a(d dVar) {
                super(dVar);
            }

            @Override // defpackage.pd4
            public final ao9 b() {
                e eVar = a.this.M;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // defpackage.pd4
            public final boolean c() {
                a.this.n();
                return true;
            }

            @Override // defpackage.pd4
            public final boolean d() {
                a aVar = a.this;
                if (aVar.O != null) {
                    return false;
                }
                aVar.b();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            pqa.a(this, getContentDescription());
            setOnTouchListener(new C0006a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.n();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, View view) {
            super(context, fVar, view, true, R.attr.actionOverflowMenuStyle, 0);
            this.f = 8388613;
            f fVar2 = a.this.Q;
            this.h = fVar2;
            yr6 yr6Var = this.i;
            if (yr6Var != null) {
                yr6Var.f(fVar2);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            a aVar = a.this;
            androidx.appcompat.view.menu.f fVar = aVar.v;
            if (fVar != null) {
                fVar.c(true);
            }
            aVar.M = null;
            super.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class f implements j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z) {
            if (fVar instanceof m) {
                ((m) fVar).z.k().c(false);
            }
            j.a aVar = a.this.x;
            if (aVar != null) {
                aVar.c(fVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            a aVar = a.this;
            if (fVar == aVar.v) {
                return false;
            }
            aVar.R = ((m) fVar).A.a;
            j.a aVar2 = aVar.x;
            if (aVar2 != null) {
                return aVar2.d(fVar);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new C0007a();
        public int t;

        /* JADX INFO: renamed from: androidx.appcompat.widget.a$g$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class C0007a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                g gVar = new g();
                gVar.t = parcel.readInt();
                return gVar;
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i) {
                return new g[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.t);
        }
    }

    public a(Context context) {
        this.t = context;
        this.w = LayoutInflater.from(context);
        this.y = R.layout.abc_action_menu_layout;
        this.z = R.layout.abc_action_menu_item_layout;
        this.L = new SparseBooleanArray();
        this.Q = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(h hVar, View view, ViewGroup viewGroup) {
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.e()) {
            k.a aVar = view instanceof k.a ? (k.a) view : (k.a) this.w.inflate(this.z, viewGroup, false);
            aVar.c(hVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.A);
            if (this.P == null) {
                this.P = new b();
            }
            actionMenuItemView.setPopupCallback(this.P);
            actionView = (View) aVar;
        }
        actionView.setVisibility(hVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.c)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        Object obj;
        c cVar = this.O;
        if (cVar != null && (obj = this.A) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.O = null;
            return true;
        }
        e eVar = this.M;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.i.dismiss();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(androidx.appcompat.view.menu.f fVar, boolean z) {
        b();
        C0005a c0005a = this.N;
        if (c0005a != null && c0005a.b()) {
            c0005a.i.dismiss();
        }
        j.a aVar = this.x;
        if (aVar != null) {
            aVar.c(fVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.A;
        ArrayList<h> arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.v;
            if (fVar != null) {
                fVar.i();
                ArrayList<h> arrayListL = this.v.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    h hVar = arrayListL.get(i2);
                    if ((hVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        h itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                        View viewA = a(hVar, childAt, viewGroup);
                        if (hVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.A).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.C) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.A).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.v;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<h> arrayList2 = fVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                v8 v8Var = arrayList2.get(i3).A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.v;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.j;
        }
        if (this.F && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        d dVar = this.C;
        if (z2) {
            if (dVar == null) {
                this.C = new d(this.t);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.C.getParent();
            if (viewGroup3 != this.A) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.C);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.A;
                d dVar2 = this.C;
                actionMenuView.getClass();
                ActionMenuView.c cVarI = ActionMenuView.i();
                cVarI.a = true;
                actionMenuView.addView(dVar2, cVarI);
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.A;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.C);
            }
        }
        ((ActionMenuView) this.A).setOverflowReserved(this.F);
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        int size;
        ArrayList<h> arrayListL;
        int i;
        boolean z;
        a aVar = this;
        androidx.appcompat.view.menu.f fVar = aVar.v;
        if (fVar != null) {
            arrayListL = fVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = aVar.J;
        int i3 = aVar.I;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.A;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            h hVar = arrayListL.get(i4);
            int i7 = hVar.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (aVar.K && hVar.C) {
                i2 = 0;
            }
            i4++;
        }
        if (aVar.F && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = aVar.L;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            h hVar2 = arrayListL.get(i9);
            int i11 = hVar2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = hVar2.b;
            if (z3) {
                View viewA = aVar.a(hVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                hVar2.f(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewA2 = aVar.a(hVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            h hVar3 = arrayListL.get(i13);
                            if (hVar3.b == i12) {
                                if ((hVar3.x & 32) == 32) {
                                    i8++;
                                }
                                hVar3.f(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    hVar2.f(z5);
                } else {
                    hVar2.f(false);
                }
                i9++;
                i = 2;
                aVar = this;
                z = true;
            }
            i9++;
            i = 2;
            aVar = this;
            z = true;
        }
        return z;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
        this.u = context;
        LayoutInflater.from(context);
        this.v = fVar;
        Resources resources = context.getResources();
        if (!this.G) {
            this.F = true;
        }
        int i = 2;
        this.H = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.J = i;
        int measuredWidth = this.H;
        if (this.F) {
            if (this.C == null) {
                d dVar = new d(this.t);
                this.C = dVar;
                if (this.E) {
                    dVar.setImageDrawable(this.D);
                    this.D = null;
                    this.E = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.C.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.C.getMeasuredWidth();
        } else {
            this.C = null;
        }
        this.I = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof g) && (i = ((g) parcelable).t) > 0 && (menuItemFindItem = this.v.findItem(i)) != null) {
            k((m) menuItemFindItem.getSubMenu());
        }
    }

    public final boolean j() {
        e eVar = this.M;
        return eVar != null && eVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        boolean z;
        if (mVar.hasVisibleItems()) {
            m mVar2 = mVar;
            while (true) {
                androidx.appcompat.view.menu.f fVar = mVar2.z;
                if (fVar == this.v) {
                    break;
                }
                mVar2 = (m) fVar;
            }
            h hVar = mVar2.A;
            ViewGroup viewGroup = (ViewGroup) this.A;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == hVar) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.R = mVar.A.a;
                int size = mVar.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = mVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C0005a c0005a = new C0005a(this.u, mVar, view);
                this.N = c0005a;
                c0005a.g = z;
                yr6 yr6Var = c0005a.i;
                if (yr6Var != null) {
                    yr6Var.q(z);
                }
                C0005a c0005a2 = this.N;
                if (!c0005a2.b()) {
                    if (c0005a2.e == null) {
                        aa0.c("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    c0005a2.d(0, 0, false, false);
                }
                j.a aVar = this.x;
                if (aVar != null) {
                    aVar.d(mVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        g gVar = new g();
        gVar.t = this.R;
        return gVar;
    }

    public final boolean n() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.F || j() || (fVar = this.v) == null || this.A == null || this.O != null) {
            return false;
        }
        fVar.i();
        if (fVar.j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.u, this.v, this.C));
        this.O = cVar;
        ((View) this.A).post(cVar);
        return true;
    }
}
