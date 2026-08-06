package io.ably.lib.push;

import android.content.Context;
import android.preference.PreferenceManager;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.rest.AblyBase;
import io.ably.lib.rest.AblyRest;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Param;
import io.ably.lib.util.Log;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Push extends PushBase {
    private static final String TAG = "io.ably.lib.push.Push";
    protected ActivationContext activationContext;

    public Push(AblyBase ablyBase) {
        super(ablyBase);
        this.activationContext = null;
    }

    public void activate(boolean z) {
        Log.v(TAG, "activate(): useCustomRegistrar=" + z);
        getStateMachine().handleEvent(ActivationStateMachine.CalledActivate.useCustomRegistrar(z, PreferenceManager.getDefaultSharedPreferences(getApplicationContext())));
    }

    public void deactivate(boolean z) {
        Log.v(TAG, "deactivate(): useCustomRegistrar=" + z);
        getStateMachine().handleEvent(ActivationStateMachine.CalledDeactivate.useCustomRegistrar(z, PreferenceManager.getDefaultSharedPreferences(getApplicationContext())));
    }

    public ActivationContext getActivationContext() {
        if (this.activationContext == null) {
            Log.v(TAG, "getActivationContext(): creating a new context and returning that");
            this.activationContext = ActivationContext.getActivationContext(getApplicationContext(), (AblyRest) this.rest);
        } else {
            Log.v(TAG, "getActivationContext(): returning existing content");
        }
        return this.activationContext;
    }

    public Context getApplicationContext() throws AblyException {
        Context applicationContext = this.rest.platform.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        Log.e(TAG, "getApplicationContext(): Unable to get application context; not set");
        throw AblyException.fromErrorInfo(new ErrorInfo("Unable to get application context; not set", 40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS));
    }

    public LocalDevice getLocalDevice() {
        return getActivationContext().getLocalDevice();
    }

    public synchronized ActivationStateMachine getStateMachine() {
        return getActivationContext().getActivationStateMachine();
    }

    @Override // io.ably.lib.push.PushBase
    public Param[] pushRequestHeaders(boolean z) {
        Param[] paramArrPushRequestHeaders = super.pushRequestHeaders(z);
        if (z) {
            try {
                Param[] paramArrDeviceIdentityHeaders = getLocalDevice().deviceIdentityHeaders();
                if (paramArrDeviceIdentityHeaders == null) {
                    Log.w(TAG, "pushRequestHeaders(): Local device returned null device identity headers!");
                    return paramArrPushRequestHeaders;
                }
                Log.v(TAG, "pushRequestHeaders(): deviceIdentityHeaders=" + Arrays.toString(paramArrDeviceIdentityHeaders));
                return HttpUtils.mergeHeaders(paramArrPushRequestHeaders, paramArrDeviceIdentityHeaders);
            } catch (AblyException e) {
                Log.w(TAG, "pushRequestHeaders(): Failed to get device identity headers. forLocalDevice=" + z, e);
            }
        }
        return paramArrPushRequestHeaders;
    }

    public void tryRequestRegistrationToken() {
        try {
            if (!getLocalDevice().isRegistered()) {
                Log.v(TAG, "Local device is not registered.");
            } else {
                Log.v(TAG, "Local device is registered.");
                getStateMachine().getRegistrationToken();
            }
        } catch (AblyException e) {
            Log.e(TAG, "couldn't validate existing push recipient device details", e);
        }
    }

    public void activate() {
        activate(false);
    }

    public void deactivate() {
        deactivate(false);
    }

    @Override // io.ably.lib.push.PushBase
    public Param[] pushRequestHeaders(String str) {
        boolean z = false;
        if (str != null) {
            try {
                if (str.equals(getLocalDevice().id)) {
                    z = true;
                }
            } catch (AblyException e) {
                Log.w(TAG, "pushRequestHeaders(): deviceId=".concat(str), e);
            }
        }
        return pushRequestHeaders(z);
    }
}
