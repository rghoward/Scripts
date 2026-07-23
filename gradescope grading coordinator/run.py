#!/usr/bin/env python3

import uvicorn


if __name__ == "__main__":
    uvicorn.run("coordinator.app:app", host="127.0.0.1", port=8844, reload=True)
