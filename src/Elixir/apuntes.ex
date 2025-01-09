defmodule Apuntes do
  @moduledoc false
  
  use Application

  def start(_type, _args) do
    Apuntes.Supervisor.start_link()
  end
end