package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import defpackage.d5a;
import defpackage.ec2;
import defpackage.y41;
import defpackage.yp5;
import defpackage.zn3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    public a A;
    public View B;
    public List<ec2> t;
    public y41 u;
    public float v;
    public float w;
    public boolean x;
    public boolean y;
    public int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        void a(List list, y41 y41Var, float f, float f2);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = Collections.EMPTY_LIST;
        this.u = y41.g;
        this.v = 0.0533f;
        this.w = 0.08f;
        this.x = true;
        this.y = true;
        androidx.media3.ui.a aVar = new androidx.media3.ui.a(context, 0);
        this.A = aVar;
        this.B = aVar;
        addView(aVar);
        this.z = 1;
    }

    private List<ec2> getCuesWithStylingPreferencesApplied() {
        if (this.x && this.y) {
            return this.t;
        }
        ArrayList arrayList = new ArrayList(this.t.size());
        for (int i = 0; i < this.t.size(); i++) {
            ec2.a aVarA = this.t.get(i).a();
            if (!this.x) {
                aVarA.n = false;
                CharSequence charSequence = aVarA.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        aVarA.b(SpannableString.valueOf(charSequence));
                    }
                    CharSequence charSequence2 = aVarA.a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof yp5)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                d5a.a(aVarA);
            } else if (!this.y) {
                d5a.a(aVarA);
            }
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private y41 getUserCaptionStyle() {
        CaptioningManager captioningManager;
        boolean zIsInEditMode = isInEditMode();
        y41 y41Var = y41.g;
        if (zIsInEditMode || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return y41Var;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        return new y41(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
    }

    private <T extends View & a> void setView(T t) {
        removeView(this.B);
        View view = this.B;
        if (view instanceof f) {
            ((f) view).u.destroy();
        }
        this.B = t;
        this.A = t;
        addView(t);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.A.a(getCuesWithStylingPreferencesApplied(), this.u, this.v, this.w);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.y = z;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.x = z;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.w = f;
        c();
    }

    public void setCues(List<ec2> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.t = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.v = f;
        c();
    }

    public void setStyle(y41 y41Var) {
        this.u = y41Var;
        c();
    }

    public void setViewType(int i) {
        if (this.z == i) {
            return;
        }
        if (i == 1) {
            setView(new androidx.media3.ui.a(getContext(), 0));
        } else {
            if (i != 2) {
                zn3.b();
                return;
            }
            setView(new f(getContext()));
        }
        this.z = i;
    }

    public SubtitleView(Context context) {
        this(context, null);
    }
}
