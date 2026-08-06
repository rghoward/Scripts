package io.intercom.android.sdk.m5.components;

import defpackage.g2b;
import defpackage.mh4;
import defpackage.os2;
import defpackage.qq2;
import defpackage.xj5;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ErrorState {
    public static final int $stable = 0;

    public /* synthetic */ ErrorState(qq2 qq2Var) {
        this();
    }

    public abstract Integer getAdditionalMessageResId();

    public abstract int getIconId();

    public abstract int getMessageResId();

    private ErrorState() {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class WithoutCTA extends ErrorState {
        public static final int $stable = 0;
        private final Integer additionalMessageResId;
        private final int iconId;
        private final int messageResId;

        public /* synthetic */ WithoutCTA(int i, int i2, Integer num, int i3, qq2 qq2Var) {
            this((i3 & 1) != 0 ? R.drawable.intercom_ic_warning : i, (i3 & 2) != 0 ? R.string.intercom_spaces_error_title : i2, (i3 & 4) != 0 ? Integer.valueOf(R.string.intercom_spaces_error_description) : num);
        }

        public static /* synthetic */ WithoutCTA copy$default(WithoutCTA withoutCTA, int i, int i2, Integer num, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = withoutCTA.iconId;
            }
            if ((i3 & 2) != 0) {
                i2 = withoutCTA.messageResId;
            }
            if ((i3 & 4) != 0) {
                num = withoutCTA.additionalMessageResId;
            }
            return withoutCTA.copy(i, i2, num);
        }

        public final int component1() {
            return this.iconId;
        }

        public final int component2() {
            return this.messageResId;
        }

        public final Integer component3() {
            return this.additionalMessageResId;
        }

        public final WithoutCTA copy(int i, int i2, Integer num) {
            return new WithoutCTA(i, i2, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithoutCTA)) {
                return false;
            }
            WithoutCTA withoutCTA = (WithoutCTA) obj;
            return this.iconId == withoutCTA.iconId && this.messageResId == withoutCTA.messageResId && xj5.a(this.additionalMessageResId, withoutCTA.additionalMessageResId);
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public Integer getAdditionalMessageResId() {
            return this.additionalMessageResId;
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public int getIconId() {
            return this.iconId;
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public int getMessageResId() {
            return this.messageResId;
        }

        public int hashCode() {
            int iA = os2.a(this.messageResId, Integer.hashCode(this.iconId) * 31, 31);
            Integer num = this.additionalMessageResId;
            return iA + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "WithoutCTA(iconId=" + this.iconId + ", messageResId=" + this.messageResId + ", additionalMessageResId=" + this.additionalMessageResId + ')';
        }

        public WithoutCTA() {
            this(0, 0, null, 7, null);
        }

        public WithoutCTA(int i, int i2, Integer num) {
            super(null);
            this.iconId = i;
            this.messageResId = i2;
            this.additionalMessageResId = num;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class WithCTA extends ErrorState {
        public static final int $stable = 0;
        private final Integer additionalMessageResId;
        private final int ctaResId;
        private final int iconId;
        private final int messageResId;
        private final mh4<g2b> onCtaClick;

        public /* synthetic */ WithCTA(int i, int i2, Integer num, int i3, mh4 mh4Var, int i4, qq2 qq2Var) {
            this((i4 & 1) != 0 ? R.drawable.intercom_ic_warning : i, (i4 & 2) != 0 ? R.string.intercom_spaces_error_title : i2, (i4 & 4) != 0 ? Integer.valueOf(R.string.intercom_spaces_error_description) : num, (i4 & 8) != 0 ? R.string.intercom_reload : i3, mh4Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WithCTA copy$default(WithCTA withCTA, int i, int i2, Integer num, int i3, mh4 mh4Var, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = withCTA.iconId;
            }
            if ((i4 & 2) != 0) {
                i2 = withCTA.messageResId;
            }
            if ((i4 & 4) != 0) {
                num = withCTA.additionalMessageResId;
            }
            if ((i4 & 8) != 0) {
                i3 = withCTA.ctaResId;
            }
            if ((i4 & 16) != 0) {
                mh4Var = withCTA.onCtaClick;
            }
            mh4 mh4Var2 = mh4Var;
            Integer num2 = num;
            return withCTA.copy(i, i2, num2, i3, mh4Var2);
        }

        public final int component1() {
            return this.iconId;
        }

        public final int component2() {
            return this.messageResId;
        }

        public final Integer component3() {
            return this.additionalMessageResId;
        }

        public final int component4() {
            return this.ctaResId;
        }

        public final mh4<g2b> component5() {
            return this.onCtaClick;
        }

        public final WithCTA copy(int i, int i2, Integer num, int i3, mh4<g2b> mh4Var) {
            mh4Var.getClass();
            return new WithCTA(i, i2, num, i3, mh4Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithCTA)) {
                return false;
            }
            WithCTA withCTA = (WithCTA) obj;
            return this.iconId == withCTA.iconId && this.messageResId == withCTA.messageResId && xj5.a(this.additionalMessageResId, withCTA.additionalMessageResId) && this.ctaResId == withCTA.ctaResId && xj5.a(this.onCtaClick, withCTA.onCtaClick);
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public Integer getAdditionalMessageResId() {
            return this.additionalMessageResId;
        }

        public final int getCtaResId() {
            return this.ctaResId;
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public int getIconId() {
            return this.iconId;
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public int getMessageResId() {
            return this.messageResId;
        }

        public final mh4<g2b> getOnCtaClick() {
            return this.onCtaClick;
        }

        public int hashCode() {
            int iA = os2.a(this.messageResId, Integer.hashCode(this.iconId) * 31, 31);
            Integer num = this.additionalMessageResId;
            return this.onCtaClick.hashCode() + os2.a(this.ctaResId, (iA + (num == null ? 0 : num.hashCode())) * 31, 31);
        }

        public String toString() {
            return "WithCTA(iconId=" + this.iconId + ", messageResId=" + this.messageResId + ", additionalMessageResId=" + this.additionalMessageResId + ", ctaResId=" + this.ctaResId + ", onCtaClick=" + this.onCtaClick + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithCTA(int i, int i2, Integer num, int i3, mh4<g2b> mh4Var) {
            super(null);
            mh4Var.getClass();
            this.iconId = i;
            this.messageResId = i2;
            this.additionalMessageResId = num;
            this.ctaResId = i3;
            this.onCtaClick = mh4Var;
        }
    }
}
