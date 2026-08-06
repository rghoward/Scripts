package io.ably.lib.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.r9a;
import defpackage.w8;
import io.ably.lib.rest.AblyRest;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.RegistrationToken;
import io.ably.lib.util.Log;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivationContext {
    protected AblyRest ably;
    protected ActivationStateMachine activationStateMachine;
    protected String clientId;
    protected final Context context;
    protected LocalDevice localDevice;
    protected final SharedPreferences prefs;
    private static final WeakHashMap<Context, ActivationContext> activationContexts = new WeakHashMap<>();
    private static final String TAG = ActivationContext.class.getName();

    public ActivationContext(Context context) {
        this.context = context;
        this.prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static ActivationContext getActivationContext(Context context, AblyRest ablyRest) {
        ActivationContext activationContext;
        WeakHashMap<Context, ActivationContext> weakHashMap = activationContexts;
        synchronized (weakHashMap) {
            try {
                activationContext = weakHashMap.get(context);
                if (activationContext == null) {
                    Log.v(TAG, "getActivationContext(): creating new ActivationContext for this application");
                    activationContext = new ActivationContext(context);
                    weakHashMap.put(context, activationContext);
                } else {
                    Log.v(TAG, "getActivationContext(): returning existing ActivationContext for this application");
                }
                if (ablyRest != null) {
                    Log.v(TAG, "Setting Ably instance on the activation context");
                    activationContext.setAbly(ablyRest);
                } else {
                    Log.v(TAG, "Not setting Ably instance on the activation context");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return activationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getRegistrationToken$0(Callback callback, r9a r9aVar) {
        Log.v(TAG, "getRegistrationToken(): FirebaseMessaging#getToken() completed: task=" + r9aVar);
        if (r9aVar.n()) {
            callback.onSuccess((String) r9aVar.j());
        } else {
            callback.onError(ErrorInfo.fromThrowable(r9aVar.i()));
        }
    }

    public static void setActivationContext(Context context, ActivationContext activationContext) {
        Log.v(TAG, "setActivationContext(): applicationContext=" + context + ", activationContext=" + activationContext);
        activationContexts.put(context, activationContext);
    }

    public AblyRest getAbly() {
        if (this.ably != null) {
            Log.v(TAG, "getAbly(): returning existing Ably instance");
            return this.ably;
        }
        String str = TAG;
        Log.v(str, "getAbly(): creating new Ably instance");
        String str2 = getLocalDevice().deviceIdentityToken;
        if (str2 == null) {
            Log.e(str, "getAbly(): unable to create Ably instance using deviceIdentityToken");
            throw AblyException.fromErrorInfo(new ErrorInfo("Unable to get Ably library instance; no device identity token", 40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS));
        }
        Log.v(str, "getAbly(): returning Ably instance using deviceIdentityToken");
        AblyRest ablyRest = new AblyRest(str2);
        this.ably = ablyRest;
        return ablyRest;
    }

    public synchronized ActivationStateMachine getActivationStateMachine() {
        try {
            if (this.activationStateMachine == null) {
                Log.v(TAG, "getActivationStateMachine(): creating new instance and returning that");
                this.activationStateMachine = new ActivationStateMachine(this);
            } else {
                Log.v(TAG, "getActivationStateMachine(): returning existing instance");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.activationStateMachine;
    }

    public Context getContext() {
        return this.context;
    }

    public AblyRest getDeviceIdentityTokenBasedAblyClient(String str) {
        ClientOptions clientOptionsCopy = this.ably.options.copy();
        clientOptionsCopy.clearAuthOptions();
        clientOptionsCopy.token = str;
        return new AblyRest(clientOptionsCopy);
    }

    public synchronized LocalDevice getLocalDevice() {
        try {
            if (this.localDevice == null) {
                Log.v(TAG, "getLocalDevice(): creating new instance and returning that");
                AblyRest ablyRest = this.ably;
                this.localDevice = new LocalDevice(this, ablyRest != null ? ablyRest.options.localStorage : null);
            } else {
                Log.v(TAG, "getLocalDevice(): returning existing instance");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.localDevice;
    }

    public SharedPreferences getPreferences() {
        return this.prefs;
    }

    public void getRegistrationToken(Callback<String> callback) {
        Log.v(TAG, "getRegistrationToken(): callback=" + callback);
        FirebaseMessaging.d().g().b(new w8(callback));
    }

    public void onNewRegistrationToken(RegistrationToken.Type type, String str) {
        String str2 = TAG;
        Log.v(str2, "onNewRegistrationToken(): type=" + type + ", token=" + str);
        LocalDevice localDevice = getLocalDevice();
        RegistrationToken registrationToken = localDevice.getRegistrationToken();
        if (registrationToken != null) {
            if (registrationToken.type != type) {
                Log.e(str2, "trying to register device with " + type + ", but it was already registered with " + registrationToken.type);
                return;
            }
            if (registrationToken.token.equals(str)) {
                return;
            }
        }
        Log.v(str2, "onNewRegistrationToken(): updating token");
        localDevice.setAndPersistRegistrationToken(new RegistrationToken(type, str));
        getActivationStateMachine().handleEvent(new ActivationStateMachine.GotPushDeviceDetails());
    }

    public void reset() {
        Log.v(TAG, "reset()");
        this.ably = null;
        getActivationStateMachine().reset();
        this.activationStateMachine = null;
        getLocalDevice().reset();
        this.localDevice = null;
    }

    public void setAbly(AblyRest ablyRest) {
        this.ably = ablyRest;
        this.clientId = ablyRest.auth.clientId;
    }

    public synchronized void setActivationStateMachine(ActivationStateMachine activationStateMachine) {
        Log.v(TAG, "setActivationStateMachine(): activationStateMachine=" + activationStateMachine);
        this.activationStateMachine = activationStateMachine;
    }

    public boolean setClientId(String str, boolean z) {
        ActivationStateMachine activationStateMachine;
        String str2 = TAG;
        Log.v(str2, "setClientId(): clientId=" + str + ", propagateGotPushDeviceDetails=" + z);
        boolean zEquals = str.equals(this.clientId);
        boolean z2 = zEquals ^ true;
        if (!zEquals) {
            this.clientId = str;
            if (this.localDevice != null) {
                Log.v(str2, "setClientId(): local device exists");
                this.localDevice.setClientId(str);
                if (this.localDevice.isRegistered() && (activationStateMachine = this.activationStateMachine) != null && z) {
                    activationStateMachine.handleEvent(new ActivationStateMachine.GotPushDeviceDetails());
                    return z2;
                }
            } else {
                Log.v(str2, "setClientId(): local device doest not exist");
            }
        }
        return z2;
    }

    public static ActivationContext getActivationContext(Context context) {
        return getActivationContext(context, null);
    }
}
