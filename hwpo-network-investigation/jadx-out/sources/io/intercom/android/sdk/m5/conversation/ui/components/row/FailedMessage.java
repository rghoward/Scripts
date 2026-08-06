package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.g2b;
import defpackage.mh4;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FailedMessage {
    public static final int $stable = 0;
    private final String message;
    private final mh4<g2b> onRetryMessageClicked;

    public FailedMessage(String str, mh4<g2b> mh4Var) {
        str.getClass();
        mh4Var.getClass();
        this.message = str;
        this.onRetryMessageClicked = mh4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FailedMessage copy$default(FailedMessage failedMessage, String str, mh4 mh4Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = failedMessage.message;
        }
        if ((i & 2) != 0) {
            mh4Var = failedMessage.onRetryMessageClicked;
        }
        return failedMessage.copy(str, mh4Var);
    }

    public final String component1() {
        return this.message;
    }

    public final mh4<g2b> component2() {
        return this.onRetryMessageClicked;
    }

    public final FailedMessage copy(String str, mh4<g2b> mh4Var) {
        str.getClass();
        mh4Var.getClass();
        return new FailedMessage(str, mh4Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FailedMessage)) {
            return false;
        }
        FailedMessage failedMessage = (FailedMessage) obj;
        return xj5.a(this.message, failedMessage.message) && xj5.a(this.onRetryMessageClicked, failedMessage.onRetryMessageClicked);
    }

    public final String getMessage() {
        return this.message;
    }

    public final mh4<g2b> getOnRetryMessageClicked() {
        return this.onRetryMessageClicked;
    }

    public int hashCode() {
        return this.onRetryMessageClicked.hashCode() + (this.message.hashCode() * 31);
    }

    public String toString() {
        return "FailedMessage(message=" + this.message + ", onRetryMessageClicked=" + this.onRetryMessageClicked + ')';
    }
}
