package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.hwpo_training_app.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class si6 extends RelativeLayout implements w55 {
    public sf6 t;
    public final sf6 u;
    public WeakReference<va1> v;

    public si6(Context context) {
        super(context);
        this.t = new sf6();
        this.u = new sf6();
        setupLayoutResource(R.layout.layout_chart_tooltip);
    }

    private void setupLayoutResource(int i) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(i, this);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
    }

    @Override // defpackage.w55
    public final void a(Canvas canvas, float f, float f2) {
        sf6 sf6VarC = c(f, f2);
        int iSave = canvas.save();
        canvas.translate(f + sf6VarC.b, f2 + sf6VarC.c);
        draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public void b(qj3 qj3Var, rw4 rw4Var) {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public sf6 c(float f, float f2) {
        sf6 offset = getOffset();
        float f3 = offset.b;
        sf6 sf6Var = this.u;
        sf6Var.b = f3;
        sf6Var.c = offset.c;
        va1 chartView = getChartView();
        float width = getWidth();
        float height = getHeight();
        float f4 = sf6Var.b;
        if (f + f4 < 0.0f) {
            sf6Var.b = -f;
        } else if (chartView != null && f + width + f4 > chartView.getWidth()) {
            sf6Var.b = (chartView.getWidth() - f) - width;
        }
        float f5 = sf6Var.c;
        if (f2 + f5 < 0.0f) {
            sf6Var.c = -f2;
        } else if (chartView != null && f2 + height + f5 > chartView.getHeight()) {
            sf6Var.c = (chartView.getHeight() - f2) - height;
        }
        return sf6Var;
    }

    public va1 getChartView() {
        WeakReference<va1> weakReference = this.v;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public sf6 getOffset() {
        return this.t;
    }

    public void setChartView(va1 va1Var) {
        this.v = new WeakReference<>(va1Var);
    }

    public void setOffset(sf6 sf6Var) {
        this.t = sf6Var;
        if (sf6Var == null) {
            this.t = new sf6();
        }
    }
}
