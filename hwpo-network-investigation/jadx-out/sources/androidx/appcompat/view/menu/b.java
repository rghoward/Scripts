package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.hwpo_training_app.R;
import defpackage.m83;
import defpackage.p51;
import defpackage.pr6;
import defpackage.yr6;
import defpackage.zr6;
import defpackage.zz;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends yr6 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View G;
    public View H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public boolean O;
    public j.a P;
    public ViewTreeObserver Q;
    public PopupWindow.OnDismissListener R;
    public boolean S;
    public final Context u;
    public final int v;
    public final int w;
    public final boolean x;
    public final Handler y;
    public final ArrayList z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final a B = new a();
    public final ViewOnAttachStateChangeListenerC0004b C = new ViewOnAttachStateChangeListenerC0004b();
    public final c D = new c();
    public int E = 0;
    public int F = 0;
    public boolean N = false;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            b bVar = b.this;
            ArrayList arrayList = bVar.A;
            if (!bVar.a() || arrayList.size() <= 0) {
                return;
            }
            int i = 0;
            if (((d) arrayList.get(0)).a.R) {
                return;
            }
            View view = bVar.H;
            if (view == null || !view.isShown()) {
                bVar.dismiss();
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((d) obj).a.b();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c implements pr6 {
        public c() {
        }

        @Override // defpackage.pr6
        public final void d(f fVar, h hVar) {
            b bVar = b.this;
            Handler handler = bVar.y;
            handler.removeCallbacksAndMessages(null);
            ArrayList arrayList = bVar.A;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (fVar == ((d) arrayList.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            handler.postAtTime(new androidx.appcompat.view.menu.c(this, i2 < arrayList.size() ? (d) arrayList.get(i2) : null, hVar, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // defpackage.pr6
        public final void g(f fVar, MenuItem menuItem) {
            b.this.y.removeCallbacksAndMessages(fVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d {
        public final zr6 a;
        public final f b;
        public final int c;

        public d(zr6 zr6Var, f fVar, int i) {
            this.a = zr6Var;
            this.b = fVar;
            this.c = i;
        }
    }

    public b(Context context, View view, int i, boolean z) {
        this.u = context;
        this.G = view;
        this.w = i;
        this.x = z;
        this.I = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.v = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.y = new Handler();
    }

    @Override // defpackage.ao9
    public final boolean a() {
        ArrayList arrayList = this.A;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).a.S.isShowing();
    }

    @Override // defpackage.ao9
    public final void b() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w((f) obj);
        }
        arrayList.clear();
        View view = this.G;
        this.H = view;
        if (view != null) {
            boolean z = this.Q == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.Q = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.B);
            }
            this.H.addOnAttachStateChangeListener(this.C);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z) {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (fVar == ((d) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((d) arrayList.get(i2)).b.c(false);
        }
        d dVar = (d) arrayList.remove(i);
        f fVar2 = dVar.b;
        zr6 zr6Var = dVar.a;
        zz zzVar = zr6Var.S;
        fVar2.r(this);
        if (this.S) {
            zr6.a.b(zzVar, null);
            zzVar.setAnimationStyle(0);
        }
        zr6Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.I = ((d) arrayList.get(size2 - 1)).c;
        } else {
            this.I = this.G.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((d) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.P;
        if (aVar != null) {
            aVar.c(fVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.Q;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.Q.removeGlobalOnLayoutListener(this.B);
            }
            this.Q = null;
        }
        this.H.removeOnAttachStateChangeListener(this.C);
        this.R.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z) {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((d) obj).a.v.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.ao9
    public final void dismiss() {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.S.isShowing()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        this.P = aVar;
    }

    @Override // defpackage.ao9
    public final m83 j() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) p51.b(1, arrayList)).a.v;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            d dVar = (d) obj;
            if (mVar == dVar.b) {
                dVar.a.v.requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        n(mVar);
        j.a aVar = this.P;
        if (aVar != null) {
            aVar.d(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        return null;
    }

    @Override // defpackage.yr6
    public final void n(f fVar) {
        fVar.b(this, this.u);
        if (a()) {
            w(fVar);
        } else {
            this.z.add(fVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i);
            if (!dVar.a.S.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.yr6
    public final void p(View view) {
        if (this.G != view) {
            this.G = view;
            this.F = Gravity.getAbsoluteGravity(this.E, view.getLayoutDirection());
        }
    }

    @Override // defpackage.yr6
    public final void q(boolean z) {
        this.N = z;
    }

    @Override // defpackage.yr6
    public final void r(int i) {
        if (this.E != i) {
            this.E = i;
            this.F = Gravity.getAbsoluteGravity(i, this.G.getLayoutDirection());
        }
    }

    @Override // defpackage.yr6
    public final void s(int i) {
        this.J = true;
        this.L = i;
    }

    @Override // defpackage.yr6
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.R = onDismissListener;
    }

    @Override // defpackage.yr6
    public final void u(boolean z) {
        this.O = z;
    }

    @Override // defpackage.yr6
    public final void v(int i) {
        this.K = true;
        this.M = i;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0163  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void w(f fVar) {
        boolean z;
        char c2;
        View childAt;
        d dVar;
        int i;
        int i2;
        int i3;
        int width;
        MenuItem item;
        e eVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.u;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        e eVar2 = new e(fVar, layoutInflaterFrom, this.x, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.N) {
            eVar2.v = true;
        } else if (a()) {
            int size = fVar.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = fVar.getItem(i4);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            eVar2.v = z;
        }
        int iO = yr6.o(eVar2, context, this.v);
        zr6 zr6Var = new zr6(context, null, this.w, 0);
        zr6Var.V = this.D;
        zr6Var.I = this;
        zz zzVar = zr6Var.S;
        zzVar.setOnDismissListener(this);
        zr6Var.H = this.G;
        zr6Var.E = this.F;
        zr6Var.R = true;
        zzVar.setFocusable(true);
        zzVar.setInputMethodMode(2);
        zr6Var.p(eVar2);
        zr6Var.r(iO);
        zr6Var.E = this.F;
        ArrayList arrayList = this.A;
        if (arrayList.size() > 0) {
            dVar = (d) p51.b(1, arrayList);
            f fVar2 = dVar.b;
            int size2 = fVar2.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    item = null;
                    break;
                }
                item = fVar2.getItem(i5);
                if (item.hasSubMenu() && fVar == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item == null) {
                c2 = 0;
                childAt = null;
            } else {
                m83 m83Var = dVar.a.v;
                ListAdapter adapter = m83Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    eVar = (e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (e) adapter;
                    headersCount = 0;
                }
                int count = eVar.getCount();
                int i6 = 0;
                c2 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == eVar.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                childAt = (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - m83Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m83Var.getChildCount()) ? m83Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c2 = 0;
            childAt = null;
            dVar = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = zr6.W;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c2] = Boolean.FALSE;
                        method.invoke(zzVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                zr6.b.a(zzVar, c2);
            }
            zr6.a.a(zzVar, null);
            m83 m83Var2 = ((d) arrayList.get(arrayList.size() - 1)).a.v;
            int[] iArr = new int[2];
            m83Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.H.getWindowVisibleDisplayFrame(rect);
            if (this.I == 1) {
                if (m83Var2.getWidth() + iArr[0] + iO > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[0] - iO < 0) {
                i = 1;
            } else {
                i = 0;
            }
            boolean z2 = i == 1;
            this.I = i;
            if (Build.VERSION.SDK_INT >= 26) {
                zr6Var.H = childAt;
                i2 = 0;
                i3 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.G.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.F & 7) == 5) {
                    iArr2[0] = this.G.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                int i7 = iArr3[0] - iArr2[0];
                i2 = iArr3[1] - iArr2[1];
                i3 = i7;
            }
            if ((this.F & 5) != 5) {
                width = z2 ? i3 + childAt.getWidth() : i3 - iO;
            } else if (z2) {
                width = i3 + iO;
            } else {
                iO = childAt.getWidth();
            }
            zr6Var.y = width;
            zr6Var.D = true;
            zr6Var.C = true;
            zr6Var.l(i2);
        } else {
            if (this.J) {
                zr6Var.y = this.L;
            }
            if (this.K) {
                zr6Var.l(this.M);
            }
            Rect rect2 = this.t;
            zr6Var.Q = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new d(zr6Var, fVar, this.I));
        zr6Var.b();
        m83 m83Var3 = zr6Var.v;
        m83Var3.setOnKeyListener(this);
        if (dVar == null && this.O && fVar.m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) m83Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(fVar.m);
            m83Var3.addHeaderView(frameLayout, null, false);
            zr6Var.b();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class ViewOnAttachStateChangeListenerC0004b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0004b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            ViewTreeObserver viewTreeObserver = bVar.Q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    bVar.Q = view.getViewTreeObserver();
                }
                bVar.Q.removeGlobalOnLayoutListener(bVar.B);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
    }
}
