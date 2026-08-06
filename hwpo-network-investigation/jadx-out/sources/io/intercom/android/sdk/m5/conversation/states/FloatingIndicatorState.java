package io.intercom.android.sdk.m5.conversation.states;

import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface FloatingIndicatorState {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class FooterNoticeIndicator implements FloatingIndicatorState {
        public static final int $stable = 8;
        private final FooterNoticeState footerNoticeState;

        public FooterNoticeIndicator(FooterNoticeState footerNoticeState) {
            footerNoticeState.getClass();
            this.footerNoticeState = footerNoticeState;
        }

        public static /* synthetic */ FooterNoticeIndicator copy$default(FooterNoticeIndicator footerNoticeIndicator, FooterNoticeState footerNoticeState, int i, Object obj) {
            if ((i & 1) != 0) {
                footerNoticeState = footerNoticeIndicator.footerNoticeState;
            }
            return footerNoticeIndicator.copy(footerNoticeState);
        }

        public final FooterNoticeState component1() {
            return this.footerNoticeState;
        }

        public final FooterNoticeIndicator copy(FooterNoticeState footerNoticeState) {
            footerNoticeState.getClass();
            return new FooterNoticeIndicator(footerNoticeState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterNoticeIndicator) && xj5.a(this.footerNoticeState, ((FooterNoticeIndicator) obj).footerNoticeState);
        }

        public final FooterNoticeState getFooterNoticeState() {
            return this.footerNoticeState;
        }

        public int hashCode() {
            return this.footerNoticeState.hashCode();
        }

        public String toString() {
            return "FooterNoticeIndicator(footerNoticeState=" + this.footerNoticeState + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class JumpToBottomIndicator implements FloatingIndicatorState {
        public static final int $stable = 0;
        private final JumpToBottomButtonState jumpToBottomButtonState;

        public JumpToBottomIndicator(JumpToBottomButtonState jumpToBottomButtonState) {
            jumpToBottomButtonState.getClass();
            this.jumpToBottomButtonState = jumpToBottomButtonState;
        }

        public static /* synthetic */ JumpToBottomIndicator copy$default(JumpToBottomIndicator jumpToBottomIndicator, JumpToBottomButtonState jumpToBottomButtonState, int i, Object obj) {
            if ((i & 1) != 0) {
                jumpToBottomButtonState = jumpToBottomIndicator.jumpToBottomButtonState;
            }
            return jumpToBottomIndicator.copy(jumpToBottomButtonState);
        }

        public final JumpToBottomButtonState component1() {
            return this.jumpToBottomButtonState;
        }

        public final JumpToBottomIndicator copy(JumpToBottomButtonState jumpToBottomButtonState) {
            jumpToBottomButtonState.getClass();
            return new JumpToBottomIndicator(jumpToBottomButtonState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof JumpToBottomIndicator) && xj5.a(this.jumpToBottomButtonState, ((JumpToBottomIndicator) obj).jumpToBottomButtonState);
        }

        public final JumpToBottomButtonState getJumpToBottomButtonState() {
            return this.jumpToBottomButtonState;
        }

        public int hashCode() {
            return this.jumpToBottomButtonState.hashCode();
        }

        public String toString() {
            return "JumpToBottomIndicator(jumpToBottomButtonState=" + this.jumpToBottomButtonState + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class None implements FloatingIndicatorState {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public int hashCode() {
            return 1010280075;
        }

        public String toString() {
            return "None";
        }
    }
}
