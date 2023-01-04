import React from 'react'
import {BrowseR, Route, Switch}

const AppRouter = () => {
  return (
    <div>
    <BrowserRouter>
    <div style={style}>
    <Switch>
    <Route exact path="/" component={UserListComponent} />
    <Route path="/users" component={UserListComponent} />
    <Route path="/add-user" component={AddListComponent} />
    <Route path="/edit-user" component={EditListComponent} />
    </Switch>
    </div>
    </BrowserRouter>
    </div>
  )
}

const style = {
    color: 'red',
    margin: '10px'
}

export default AppRouter