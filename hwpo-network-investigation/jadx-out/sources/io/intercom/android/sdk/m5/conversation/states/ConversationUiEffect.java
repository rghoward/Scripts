package io.intercom.android.sdk.m5.conversation.states;

import defpackage.e44;
import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ConversationUiEffect {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class LockScreenOrientation extends ConversationUiEffect {
        public static final int $stable = 0;
        public static final LockScreenOrientation INSTANCE = new LockScreenOrientation();

        private LockScreenOrientation() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ShowMediaLimitExceeded extends ConversationUiEffect {
        public static final int $stable = 0;
        private final int maxLimit;

        public ShowMediaLimitExceeded(int i) {
            super(null);
            this.maxLimit = i;
        }

        public static /* synthetic */ ShowMediaLimitExceeded copy$default(ShowMediaLimitExceeded showMediaLimitExceeded, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = showMediaLimitExceeded.maxLimit;
            }
            return showMediaLimitExceeded.copy(i);
        }

        public final int component1() {
            return this.maxLimit;
        }

        public final ShowMediaLimitExceeded copy(int i) {
            return new ShowMediaLimitExceeded(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowMediaLimitExceeded) && this.maxLimit == ((ShowMediaLimitExceeded) obj).maxLimit;
        }

        public final int getMaxLimit() {
            return this.maxLimit;
        }

        public int hashCode() {
            return Integer.hashCode(this.maxLimit);
        }

        public String toString() {
            return e44.a(new StringBuilder("ShowMediaLimitExceeded(maxLimit="), this.maxLimit, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ShowUploadErrorDialog extends ConversationUiEffect {
        public static final int $stable = 0;
        private final MediaUploadItem uploadItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowUploadErrorDialog(MediaUploadItem mediaUploadItem) {
            super(null);
            mediaUploadItem.getClass();
            this.uploadItem = mediaUploadItem;
        }

        public static /* synthetic */ ShowUploadErrorDialog copy$default(ShowUploadErrorDialog showUploadErrorDialog, MediaUploadItem mediaUploadItem, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaUploadItem = showUploadErrorDialog.uploadItem;
            }
            return showUploadErrorDialog.copy(mediaUploadItem);
        }

        public final MediaUploadItem component1() {
            return this.uploadItem;
        }

        public final ShowUploadErrorDialog copy(MediaUploadItem mediaUploadItem) {
            mediaUploadItem.getClass();
            return new ShowUploadErrorDialog(mediaUploadItem);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowUploadErrorDialog) && xj5.a(this.uploadItem, ((ShowUploadErrorDialog) obj).uploadItem);
        }

        public final MediaUploadItem getUploadItem() {
            return this.uploadItem;
        }

        public int hashCode() {
            return this.uploadItem.hashCode();
        }

        public String toString() {
            return "ShowUploadErrorDialog(uploadItem=" + this.uploadItem + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ShowUploadSizeLimitDialog extends ConversationUiEffect {
        public static final int $stable = 0;
        private final String uploadSizeLimitMB;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowUploadSizeLimitDialog(String str) {
            super(null);
            str.getClass();
            this.uploadSizeLimitMB = str;
        }

        public static /* synthetic */ ShowUploadSizeLimitDialog copy$default(ShowUploadSizeLimitDialog showUploadSizeLimitDialog, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showUploadSizeLimitDialog.uploadSizeLimitMB;
            }
            return showUploadSizeLimitDialog.copy(str);
        }

        public final String component1() {
            return this.uploadSizeLimitMB;
        }

        public final ShowUploadSizeLimitDialog copy(String str) {
            str.getClass();
            return new ShowUploadSizeLimitDialog(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowUploadSizeLimitDialog) && xj5.a(this.uploadSizeLimitMB, ((ShowUploadSizeLimitDialog) obj).uploadSizeLimitMB);
        }

        public final String getUploadSizeLimitMB() {
            return this.uploadSizeLimitMB;
        }

        public int hashCode() {
            return this.uploadSizeLimitMB.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("ShowUploadSizeLimitDialog(uploadSizeLimitMB="), this.uploadSizeLimitMB, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class UnlockScreenOrientation extends ConversationUiEffect {
        public static final int $stable = 0;
        public static final UnlockScreenOrientation INSTANCE = new UnlockScreenOrientation();

        private UnlockScreenOrientation() {
            super(null);
        }
    }

    public /* synthetic */ ConversationUiEffect(qq2 qq2Var) {
        this();
    }

    private ConversationUiEffect() {
    }
}
