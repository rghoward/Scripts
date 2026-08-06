package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import com.google.android.material.button.MaterialButton;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rj6<S> extends yy7<S> {
    public n21 A;
    public RecyclerView B;
    public RecyclerView C;
    public View D;
    public View E;
    public View F;
    public View G;
    public MaterialButton H;
    public AccessibilityManager I;
    public y J;
    public boolean K;
    public int u;
    public wk2<S> v;
    public a21 w;
    public am2 x;
    public by6 y;
    public e z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends m3 {
        @Override // defpackage.m3
        public final void onInitializeAccessibilityNodeInfo(View view, j4 j4Var) {
            super.onInitializeAccessibilityNodeInfo(view, j4Var);
            j4Var.k(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b extends ks9 {
        public final /* synthetic */ int E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, int i, int i2) {
            super(context, i, false);
            this.E = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void K0(RecyclerView.a0 a0Var, int[] iArr) {
            rj6 rj6Var = rj6.this;
            RecyclerView recyclerView = rj6Var.C;
            if (this.E == 0) {
                iArr[0] = recyclerView.getWidth();
                iArr[1] = rj6Var.C.getWidth();
            } else {
                iArr[0] = recyclerView.getHeight();
                iArr[1] = rj6Var.C.getHeight();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c {
        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d {
        public d() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        public static final e t;
        public static final e u;
        public static final /* synthetic */ e[] v;

        static {
            e eVar = new e("DAY", 0);
            t = eVar;
            e eVar2 = new e("YEAR", 1);
            u = eVar2;
            v = new e[]{eVar, eVar2};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) v.clone();
        }
    }

    public static boolean j(rj6 rj6Var, boolean z) {
        by6 by6Var;
        if (rj6Var.K) {
            return false;
        }
        if (rj6Var.C.getScrollState() != 0) {
            return true;
        }
        fy6 fy6Var = (fy6) rj6Var.C.getAdapter();
        if (fy6Var == null || (by6Var = rj6Var.y) == null) {
            return false;
        }
        int iV = fy6Var.v(by6Var) + (z ? 1 : -1);
        if (iV < 0 || iV >= fy6Var.d.z) {
            return false;
        }
        fy6Var.k = z ? 2 : 1;
        rj6Var.k(fy6Var.u(iV));
        return true;
    }

    @Override // defpackage.yy7
    public final void i(gk6.a aVar) {
        this.t.add(aVar);
    }

    public final void k(by6 by6Var) {
        fy6 fy6Var = (fy6) this.C.getAdapter();
        int iV = fy6Var.v(by6Var);
        AccessibilityManager accessibilityManager = this.I;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iV2 = iV - fy6Var.v(this.y);
            boolean z = Math.abs(iV2) > 3;
            boolean z2 = iV2 > 0;
            this.y = by6Var;
            if (z && z2) {
                this.C.j0(iV - 3);
                this.C.post(new qj6(this, iV));
            } else {
                RecyclerView recyclerView = this.C;
                if (z) {
                    recyclerView.j0(iV + 3);
                    this.C.post(new qj6(this, iV));
                } else {
                    recyclerView.post(new qj6(this, iV));
                }
            }
        } else {
            this.y = by6Var;
            this.C.j0(iV);
        }
        n();
        o(iV);
    }

    public final void l(e eVar) {
        this.z = eVar;
        if (eVar == e.u) {
            this.B.getLayoutManager().x0(this.y.v - ((prb) this.B.getAdapter()).d.w.t.v);
            this.F.setVisibility(0);
            this.G.setVisibility(8);
            this.D.setVisibility(8);
            this.E.setVisibility(8);
            return;
        }
        if (eVar == e.t) {
            this.F.setVisibility(8);
            this.G.setVisibility(0);
            this.D.setVisibility(0);
            this.E.setVisibility(0);
            k(this.y);
        }
    }

    public final void m(View view) {
        if (view == null) {
            return;
        }
        e eVar = this.z;
        if (eVar == e.u) {
            egb.p(view, getString(R.string.mtrl_picker_pane_title_year_view));
        } else if (eVar == e.t) {
            egb.p(view, getString(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void n() {
        by6 by6Var;
        fy6 fy6Var = (fy6) this.C.getAdapter();
        if (fy6Var != null) {
            RecyclerView.g gVar = fy6Var.a;
            if (this.K || (by6Var = this.y) == null || by6Var.equals(fy6Var.j)) {
                return;
            }
            int iV = fy6Var.v(fy6Var.j);
            fy6Var.j = by6Var;
            int iV2 = fy6Var.v(by6Var);
            gVar.d(iV, 1);
            gVar.d(iV2, 1);
        }
    }

    public final void o(int i) {
        View view = this.E;
        if (view != null) {
            view.setEnabled(i + 1 < this.C.getAdapter().f());
        }
        View view2 = this.D;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }

    @Override // androidx.fragment.app.f
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.u = bundle.getInt("THEME_RES_ID_KEY");
        this.v = (wk2) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.w = (a21) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.x = (am2) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.y = (by6) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.u);
        this.A = new n21(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.I = (AccessibilityManager) requireContext().getSystemService("accessibility");
        by6 by6Var = this.w.t;
        boolean zR = gk6.r(contextThemeWrapper, android.R.attr.windowFullscreen);
        this.K = zR;
        if (zR) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = cy6.z;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        egb.o(gridView, new a());
        int i4 = this.w.x;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new rm2(i4) : new rm2()));
        gridView.setNumColumns(by6Var.w);
        gridView.setEnabled(false);
        this.C = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        this.C.setLayoutManager(new b(getContext(), i2, i2));
        this.C.setTag("MONTHS_VIEW_GROUP_TAG");
        fy6 fy6Var = new fy6(contextThemeWrapper, this.v, this.w, this.x, new c(), new d());
        this.C.setAdapter(fy6Var);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.B = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.B.setLayoutManager(new GridLayoutManager(contextThemeWrapper, integer));
            this.B.setAdapter(new prb(this));
            this.B.h(new tj6(this));
        }
        if (!this.K) {
            y yVar = new y();
            this.J = yVar;
            yVar.a(this.C);
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.H = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            egb.o(this.H, new uj6(this));
            View viewFindViewById = viewInflate.findViewById(R.id.month_navigation_previous);
            this.D = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            pqa.a(this.D, getString(R.string.mtrl_picker_prev_month_tooltip));
            View viewFindViewById2 = viewInflate.findViewById(R.id.month_navigation_next);
            this.E = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            pqa.a(this.E, getString(R.string.mtrl_picker_next_month_tooltip));
            this.F = viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.G = viewInflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            l(e.t);
            this.H.setText(this.y.h());
            this.C.i(new vj6(this, fy6Var));
            this.H.setOnClickListener(new wj6(this));
            this.E.setOnClickListener(new oj6(this, fy6Var));
            this.D.setOnClickListener(new pj6(this, fy6Var));
            o(fy6Var.v(this.y));
        }
        this.C.j0(fy6Var.v(this.y));
        egb.o(this.C, new sj6());
        m(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.f
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.u);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.v);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.w);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.x);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.y);
    }
}
