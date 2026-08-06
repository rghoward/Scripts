package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.qq2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class RecordingException extends Exception {
    public static final int $stable = 0;

    public /* synthetic */ RecordingException(String str, Throwable th, int i, qq2 qq2Var) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordingException(String str, Throwable th) {
        super(str, th);
        str.getClass();
    }
}
