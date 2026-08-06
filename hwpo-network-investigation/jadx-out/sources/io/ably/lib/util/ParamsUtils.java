package io.ably.lib.util;

import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.Param;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ParamsUtils {
    public static Param[] enrichParams(Param[] paramArr, ClientOptions clientOptions) {
        if (clientOptions.pushFullWait) {
            paramArr = Param.push(paramArr, "fullWait", "true");
        }
        return clientOptions.addRequestIds ? Param.set(paramArr, Crypto.generateRandomRequestId()) : paramArr;
    }
}
