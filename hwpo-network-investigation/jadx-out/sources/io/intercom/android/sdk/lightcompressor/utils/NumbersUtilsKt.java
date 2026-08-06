package io.intercom.android.sdk.lightcompressor.utils;

import defpackage.wk6;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NumbersUtilsKt {
    public static final int generateWidthHeightValue(double d, double d2) {
        return roundEven(wk6.a((d * d2) / 16.0d) * 16);
    }

    private static final int roundEven(int i) {
        return (i + 1) & (-2);
    }

    public static final int uInt32ToInt(long j) throws Exception {
        if (j > 2147483647L || j < 0) {
            throw new Exception("uInt32 value is too large");
        }
        return (int) j;
    }

    public static final long uInt32ToLong(int i) {
        return i;
    }

    public static final long uInt64ToLong(long j) throws Exception {
        if (j >= 0) {
            return j;
        }
        throw new Exception("uInt64 value is too large");
    }

    public static final int uInt32ToInt(int i) throws Exception {
        if (i >= 0) {
            return i;
        }
        throw new Exception("uInt32 value is too large");
    }
}
