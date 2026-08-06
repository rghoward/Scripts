package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nd2 extends MaterialCardView {
    public static final a Companion = new a();
    public final int H;
    public final View I;
    public final o7a J;
    public final o7a K;
    public final o7a L;
    public final o7a M;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public nd2(Context context, String str, int i) {
        super(context);
        this.H = i;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.J = new o7a(new jd2(0, this));
        this.K = new o7a(new kd2(context, 0));
        this.L = new o7a(new ld2(0, this));
        this.M = new o7a(new md2(0, this));
        setLayoutParams(layoutParams);
        setElevation(0.0f);
        setRadius(0.0f);
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(getTabBackgroundShape());
        gradientDrawable.setColor(getTabBackgroundColor());
        view.setBackground(gradientDrawable);
        addView(view);
        this.I = view;
        setCardBackgroundColor(getContext().getColor(R.color.controlStroke));
        MaterialTextView materialTextView = new MaterialTextView(context);
        materialTextView.setTextAppearance(R.style.CaptionXL_Black_UpperCase);
        materialTextView.setTextSize(2, 12.0f);
        materialTextView.setTextColor(new ColorStateList(new int[][]{new int[]{-16842913}, new int[]{android.R.attr.state_selected}}, new int[]{materialTextView.getContext().getColor(R.color.labelPrimary), materialTextView.getContext().getColor(R.color.labelActive)}));
        materialTextView.setLayoutParams(layoutParams);
        materialTextView.setGravity(17);
        materialTextView.setText(str);
        addView(materialTextView);
    }

    public static float[] f(nd2 nd2Var) {
        float outlineRadius = nd2Var.getOutlineRadius();
        int i = nd2Var.H;
        float outlineThickness = outlineRadius - nd2Var.getOutlineThickness();
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            float f = 0.0f;
            switch (i2) {
                case 0:
                case 1:
                    if (i != 0) {
                        continue;
                    }
                    fArr[i2] = f;
                    break;
                case 2:
                case 3:
                    if (i != 1) {
                        continue;
                    }
                    fArr[i2] = f;
                    break;
                case 4:
                case 5:
                    if (i != 1) {
                        continue;
                    }
                    fArr[i2] = f;
                    break;
                case 6:
                case 7:
                    if (i != 0) {
                        continue;
                    }
                    fArr[i2] = f;
                    break;
                default:
                    continue;
                    fArr[i2] = f;
                    break;
            }
            f = outlineThickness;
            fArr[i2] = f;
        }
        return fArr;
    }

    private final float getOutlineRadius() {
        return ((Number) this.J.getValue()).floatValue();
    }

    private final int getOutlineThickness() {
        return ((Number) this.K.getValue()).intValue();
    }

    private final ColorStateList getTabBackgroundColor() {
        return (ColorStateList) this.L.getValue();
    }

    private final float[] getTabBackgroundShape() {
        return (float[]) this.M.getValue();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        View view = this.I;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int outlineThickness = 0;
            int outlineThickness2 = z ? 0 : getOutlineThickness();
            int outlineThickness3 = z ? 0 : getOutlineThickness();
            int i = this.H;
            int outlineThickness4 = ((i == 0 || i == 1) && !z) ? getOutlineThickness() : 0;
            if ((i == 1 || i == 2) && !z) {
                outlineThickness = getOutlineThickness();
            }
            marginLayoutParams.setMargins(outlineThickness4, outlineThickness2, outlineThickness, outlineThickness3);
        }
        view.setLayoutParams(marginLayoutParams);
    }
}
