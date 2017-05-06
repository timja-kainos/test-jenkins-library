package com.github.timja

class Echo implements Serializable {

  def jenkins

  Echo(jenkins) {
    this.jenkins = jenkins
  }

  def echo(String text) {
    jenkins.echo(text)
  }
}
