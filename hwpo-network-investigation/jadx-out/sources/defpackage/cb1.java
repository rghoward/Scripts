package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class cb1 extends si6 {
    private final int getChartWidth() {
        return getChartView().getMeasuredWidth();
    }

    private final ConstraintLayout getTooltipContent() {
        return (ConstraintLayout) findViewById(R.id.tooltipContent);
    }

    private final MaterialTextView getTooltipDate() {
        return (MaterialTextView) findViewById(R.id.tooltipDate);
    }

    private final MaterialTextView getTooltipValue() {
        return (MaterialTextView) findViewById(R.id.tooltipValue);
    }

    private final float getVerticalOffset() {
        return getResources().getDimension(R.dimen.chart_tooltip_vertical_offset);
    }

    @Override // defpackage.si6, defpackage.w55
    public final void b(qj3 qj3Var, rw4 rw4Var) {
        Object obj = qj3Var.u;
        jl3 jl3Var = obj instanceof jl3 ? (jl3) obj : null;
        if (jl3Var != null) {
            getTooltipValue().setText(jl3Var.a);
            getTooltipDate().setText(jl3Var.b);
        }
        super.b(qj3Var, rw4Var);
    }

    @Override // defpackage.si6
    public final sf6 c(float f, float f2) {
        float f3;
        boolean z = f2 - Math.abs(getOffset().c) > 0.0f;
        boolean z2 = f - Math.abs(getOffset().b) > 0.0f;
        boolean z3 = Math.abs(getOffset().b) + f < ((float) getChartWidth());
        if (z && z2 && z3) {
            return getOffset();
        }
        if (z3) {
            f3 = !z2 ? 0.0f : getOffset().b;
        } else {
            f3 = -getWidth();
        }
        return new sf6(f3, z ? getOffset().c : 0.0f);
    }

    @Override // defpackage.si6
    public sf6 getOffset() {
        return new sf6(getTooltipContent().getMeasuredWidth() / (-2.0f), (-getTooltipContent().getMeasuredHeight()) - getVerticalOffset());
    }
}
