package io.intercom.android.sdk.m5.components;

import android.content.Context;
import android.util.AttributeSet;
import com.intercom.twig.BuildConfig;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.h37;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.qq2;
import defpackage.uz4;
import defpackage.v0;
import defpackage.xj8;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButton;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPrimaryButton extends v0 {
    public static final int $stable = 0;
    private final h37 onClick$delegate;
    private final h37 text$delegate;
    private final h37 trailingIconId$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercomPrimaryButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.text$delegate = bl7.i(BuildConfig.FLAVOR);
        this.onClick$delegate = bl7.i(new uz4(1));
        this.trailingIconId$delegate = bl7.i(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b Content$lambda$1(IntercomPrimaryButton intercomPrimaryButton, int i, jt1 jt1Var, int i2) {
        intercomPrimaryButton.Content(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @Override // defpackage.v0
    public void Content(jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(346924157);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomPrimaryButtonKt.IntercomPrimaryButton(getText(), null, getTrailingIconId(), getOnClick(), bj4VarO, 0, 2);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: fi5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomPrimaryButton.Content$lambda$1(this.t, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    public final mh4<g2b> getOnClick() {
        return (mh4) this.onClick$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getText() {
        return (String) this.text$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getTrailingIconId() {
        return (Integer) this.trailingIconId$delegate.getValue();
    }

    public final void setOnClick(mh4<g2b> mh4Var) {
        mh4Var.getClass();
        this.onClick$delegate.setValue(mh4Var);
    }

    public final void setText(String str) {
        str.getClass();
        this.text$delegate.setValue(str);
    }

    public final void setTrailingIconId(Integer num) {
        this.trailingIconId$delegate.setValue(num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntercomPrimaryButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ IntercomPrimaryButton(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntercomPrimaryButton(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
