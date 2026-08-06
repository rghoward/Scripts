package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.j4;
import defpackage.k4;
import defpackage.m3;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends m3 {
    public final RecyclerView t;
    public final a u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends m3 {
        public final d0 t;
        public final WeakHashMap u = new WeakHashMap();

        public a(d0 d0Var) {
            this.t = d0Var;
        }

        @Override // defpackage.m3
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            m3 m3Var = (m3) this.u.get(view);
            return m3Var != null ? m3Var.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // defpackage.m3
        public final k4 getAccessibilityNodeProvider(View view) {
            m3 m3Var = (m3) this.u.get(view);
            return m3Var != null ? m3Var.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // defpackage.m3
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            m3 m3Var = (m3) this.u.get(view);
            if (m3Var != null) {
                m3Var.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // defpackage.m3
        public final void onInitializeAccessibilityNodeInfo(View view, j4 j4Var) {
            d0 d0Var = this.t;
            RecyclerView recyclerView = d0Var.t;
            RecyclerView recyclerView2 = d0Var.t;
            if (recyclerView.Q() || recyclerView2.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, j4Var);
                return;
            }
            recyclerView2.getLayoutManager().c0(view, j4Var);
            m3 m3Var = (m3) this.u.get(view);
            if (m3Var != null) {
                m3Var.onInitializeAccessibilityNodeInfo(view, j4Var);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, j4Var);
            }
        }

        @Override // defpackage.m3
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            m3 m3Var = (m3) this.u.get(view);
            if (m3Var != null) {
                m3Var.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // defpackage.m3
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            m3 m3Var = (m3) this.u.get(viewGroup);
            return m3Var != null ? m3Var.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // defpackage.m3
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            d0 d0Var = this.t;
            RecyclerView recyclerView = d0Var.t;
            RecyclerView recyclerView2 = d0Var.t;
            if (recyclerView.Q() || recyclerView2.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            m3 m3Var = (m3) this.u.get(view);
            if (m3Var != null) {
                if (m3Var.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            RecyclerView.v vVar = recyclerView2.getLayoutManager().b.v;
            return false;
        }

        @Override // defpackage.m3
        public final void sendAccessibilityEvent(View view, int i) {
            m3 m3Var = (m3) this.u.get(view);
            if (m3Var != null) {
                m3Var.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // defpackage.m3
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            m3 m3Var = (m3) this.u.get(view);
            if (m3Var != null) {
                m3Var.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public d0(RecyclerView recyclerView) {
        this.t = recyclerView;
        a aVar = this.u;
        if (aVar != null) {
            this.u = aVar;
        } else {
            this.u = new a(this);
        }
    }

    @Override // defpackage.m3
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.t.Q()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().a0(accessibilityEvent);
        }
    }

    @Override // defpackage.m3
    public final void onInitializeAccessibilityNodeInfo(View view, j4 j4Var) {
        super.onInitializeAccessibilityNodeInfo(view, j4Var);
        RecyclerView recyclerView = this.t;
        if (recyclerView.Q() || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.b0(recyclerView2.v, recyclerView2.B0, j4Var);
    }

    @Override // defpackage.m3
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.t;
        if (recyclerView.Q() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().o0(i, bundle);
    }
}
